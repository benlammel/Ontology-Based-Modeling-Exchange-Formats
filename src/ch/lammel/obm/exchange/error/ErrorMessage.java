package ch.lammel.obm.exchange.error;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;

public class ErrorMessage implements OntologyBasedModelingExchangeFormatInterface {

	private String reason;
	private String action;

	public ErrorMessage() {
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
