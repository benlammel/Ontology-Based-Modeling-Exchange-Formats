package ch.lammel.obm.exchange.notification;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;
import ch.lammel.obm.exchange.notification.NotificationMessage.NotificationType;

public class NotificationMessage implements OntologyBasedModelingExchangeFormatInterface {
	
	public enum NotificationType { NEUTRAL, ERROR, SUCCESS };

	private String messageDetails;
	private String message;
	private NotificationType type;

	public NotificationMessage() {
	}

	public void setMessageDetails(String messageDetails) {
		this.messageDetails = messageDetails;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setNotificationType(NotificationType type) {
		this.type = type;
	}

}
