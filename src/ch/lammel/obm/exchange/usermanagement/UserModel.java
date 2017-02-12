package ch.lammel.obm.exchange.usermanagement;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;
import ch.lammel.obm.exchange.type.ExchangeType;

public class UserModel implements OntologyBasedModelingExchangeFormatInterface {
	
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String userURI;
	private String creationTime;
	
	private ExchangeType exchangeType;
	
	private UserModel(){
		exchangeType = ExchangeType.USERMODEL;
	}
	
	public UserModel(String email, String password) {
		this();
		this.setEmail(email);
		this.setPassword(password);
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	//	public UserModel(){
//	}
//	
//	public String getEmail() {
//		return email;
//	}
//	
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("= User =\n");
		sb.append("email: \t" +email+"\n");
		sb.append("First Name: \t" +firstName+"\n");
		sb.append("Last Name: \t" +lastName +"\n");
		sb.append("Password: \t" +password+"\n");
		sb.append("User URI: \t" +userURI+"\n");
		return sb.toString();
	}
//
//	public void setUserURI(String userURI) {
//		this.userURI = userURI;
//	}
//
//	public String getUserURI() {
//		return userURI;
//	}

	public String getUserURI() {
		return this.userURI;
	}

	public String getPassword() {
		return this.password;
	}

	public String getEmail() {
		return email;
	}

	public void setUserURI(String userURI) {
		this.userURI = userURI;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public ExchangeType getExchangeType() {
		return exchangeType;
	}
}
