package mx.com.redhat.consulting.coppel.poc;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoppelCsvInputResponseProcessor implements Processor {
	private static final Logger LOG = LoggerFactory.getLogger(CoppelCsvInputResponseProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		String message = exchange.getIn().getBody().toString();
		LOG.info("message input: " + message);
		message = message.replaceAll("\\|#$", "");
		LOG.info("message output: " + message);
		exchange.getOut().setBody(message);
	}

}
