package ch.lammel.obm.exchange.type;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;
import ch.lammel.obm.exchange.notification.NotificationMessage;
import ch.lammel.obm.exchange.usermanagement.Session;
import ch.lammel.obm.exchange.usermanagement.UserModel;

public enum ExchangeType {
	SESSION(Session.class),
	USERMODEL(UserModel.class), 
	NOTSET(null),
	NOTIFICATION(NotificationMessage.class);
	
	private Class assignedClass;

	<T> ExchangeType(Class assignedClass){
		this.assignedClass = assignedClass;
	}
	

	public String getIdentifier() {
		return "\"exchangeType\":\"" +toString() +"\"";
	}

	public Class<OntologyBasedModelingExchangeFormatInterface> getAssignedClass() {
		return assignedClass;
	}

}
