package sample.camel;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.camel.service.PolicyRequest;

@RestController
public class CustomerRestController {
	
	@Produce
	ProducerTemplate producerTemplate;

	@RequestMapping(value = "createQuoteRequest", method = RequestMethod.POST)
	public PolicyRequest createQuote(@RequestBody PolicyRequest policyRequest) {
		producerTemplate.sendBody("direct:createQuote",policyRequest);
		return policyRequest;
	}
}
