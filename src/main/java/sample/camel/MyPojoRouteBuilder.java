/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.camel;

import java.util.HashMap;

import javax.xml.namespace.QName;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.apache.camel.model.dataformat.JacksonXMLDataFormat;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.tempuri.Authenticate;
import org.tempuri.AuthenticateResponse;
import org.tempuri.ICustomerPortalService;

import sample.camel.service.ContactService;

/**
 * This class demonstrate how to expose a SOAP endpoint starting from java
 * classes
 */
@Component
public class MyPojoRouteBuilder extends RouteBuilder {

	public final QName BasicHttpBindingICustomerPortalService = new QName("http://tempuri.org/",
			"BasicHttpBinding_ICustomerPortalService");
	public final QName GCCustomerPortalServiceCustom = new QName("http://tempuri.org/",
			"GCCustomerPortalService_Custom");

	@Bean(name = "createQuoteBean")
	public CxfEndpoint buildCxfEndpoint1() {
		CxfEndpoint customersEndpoint = new CxfEndpoint();
		customersEndpoint.setWsdlURL("wsdl/GCCustomerPortalService.wsdl");
		// customersEndpoint.setServiceName("CustomerPortalService");

		customersEndpoint.setPortNameAsQName(BasicHttpBindingICustomerPortalService);
		customersEndpoint.setServiceClass(ICustomerPortalService.class);
		// customersEndpoint.setAddress("/customers");
		customersEndpoint.setProperties(new HashMap<>());
		// Request validation will be executed, in particular the name validation in
		// getCustomersByName
		// customersEndpoint.getProperties().put("schema-validation-enabled", "true");
		// CxfEndpoint cxf = new CxfEndpoint();

		// cxf.setServiceClass(ICustomerPortalService.class);
		return customersEndpoint;
	}

	@Bean
	CxfEndpoint contact() {
		CxfEndpoint contactEndpoint = new CxfEndpoint();
		contactEndpoint.setServiceClass(ContactService.class);
		contactEndpoint.setAddress("/contact");

		return contactEndpoint;
	}

	@Override
	public void configure() throws Exception {
		JacksonXMLDataFormat dataFormat = new JacksonXMLDataFormat();
		dataFormat.setUnmarshalType(Authenticate.class);
		//JaxbDataFormat xmlDataFormat = new JaxbDataFormat();
		//JacksonXMLDataFormat xmlDataFormat = new JacksonXMLDataFormat();
		
		from("cxf:bean:contact").recipientList(simple("bean:inMemoryContactService?method=${header.operationName}"));

		fromF("direct:createQuote").removeHeaders("CamelHttp*").log("${body}").process(new Processor() {
			@Override
			public void process(Exchange exchange) throws Exception {
				
				
				//JAXBContext con = JAXBContext.newInstance(Authenticate.class);
				
				
				/*
				 * Authenticate authenticate = new Authenticate(); JAXBElement<String> userId =
				 * new JAXBElement<String>(new QName("http://tempuri.org/", "UserID"),
				 * String.class, "O1000130"); JAXBElement<String> password = new
				 * JAXBElement<String>(new QName("http://tempuri.org/", "Password"),
				 * String.class, "pass@123"); authenticate.setUserID(userId);
				 * authenticate.setPassword(password); exchange.getIn().setBody(authenticate);
				 */}
		}).setHeader(CxfConstants.OPERATION_NAME, constant("Authenticate"))
				.setHeader(CxfConstants.OPERATION_NAMESPACE, constant("http://tempuri.org/")).log("${body}")
				.marshal(dataFormat).to("cxf:bean:createQuoteBean").log("responseBody").log("${body}").choice()
				.when(simple("${body} contains 'OK'")).process(new Processor() {
					@Override
					public void process(Exchange exchange) throws Exception {
						MessageContentsList response = (MessageContentsList) exchange.getIn().getBody();
						AuthenticateResponse authenticateResponse = (AuthenticateResponse) response.get(0);
						exchange.getIn().setHeader("Bearer Token", authenticateResponse.getAuthenticateResult());
					}
				}).end();
	}
}
