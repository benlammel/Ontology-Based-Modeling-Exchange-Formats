package ch.lammel.obm.exchange.usermanagement;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;

public class Session implements OntologyBasedModelingExchangeFormatInterface {

	@Deprecated
	private String sessionID;
	@Deprecated
	private long ttl;
	@Deprecated
	private String internalUserID;
	private String token;

	@Deprecated
	public Session(String sessionID, long ttl, String internalUserID) {
		this.sessionID = sessionID;
		this.ttl = ttl;
		this.internalUserID = internalUserID;
	}

	public Session() {
	}

	public void setToken(String token) {
		this.token = token;
	}

}
