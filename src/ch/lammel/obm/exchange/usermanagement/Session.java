package ch.lammel.obm.exchange.usermanagement;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;
import ch.lammel.obm.exchange.type.ExchangeType;

public class Session implements OntologyBasedModelingExchangeFormatInterface {

	@Deprecated
	private String sessionID;
	@Deprecated
	private long ttl;
	@Deprecated
	private String internalUserID;
	private String token;
	
	private ExchangeType exchangeType;

	public Session() {
		exchangeType = ExchangeType.SESSION;
	}
	
	@Deprecated
	public Session(String sessionID, long ttl, String internalUserID) {
		this();
		this.sessionID = sessionID;
		this.ttl = ttl;
		this.internalUserID = internalUserID;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public ExchangeType getExchangeType() {
		return exchangeType;
	}

}
