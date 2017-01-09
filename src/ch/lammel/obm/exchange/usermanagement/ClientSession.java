package ch.lammel.obm.exchange.usermanagement;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;

public class ClientSession implements OntologyBasedModelingExchangeFormatInterface {

	private String sessionID;
	private long ttl;
	private String internalUserID;

	public ClientSession(String sessionID, long ttl, String internalUserID) {
		this.sessionID = sessionID;
		this.ttl = ttl;
		this.internalUserID = internalUserID;
	}

}
