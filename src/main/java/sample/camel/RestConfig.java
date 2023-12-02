package sample.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

import sample.camel.service.PolicyRequest;

@Component
public class RestConfig extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		rest().post("/createQuote").type(PolicyRequest.class).consumes("application/json")
				.produces("application/json").description("createQuote in GC coresystem").to("direct:createQuote");

	}

}
