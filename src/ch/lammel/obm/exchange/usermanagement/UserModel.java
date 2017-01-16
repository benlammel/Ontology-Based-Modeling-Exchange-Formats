package ch.lammel.obm.exchange.usermanagement;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;
import ch.lammel.obm.exchange.interfaces.OntologyModelAnnotation;

@OntologyModelAnnotation(uri="obm:User")
public class UserModel implements OntologyBasedModelingExchangeFormatInterface {
	
	@OntologyModelAnnotation(uri="obm:userHasEmail")
	public String email;
	
	@OntologyModelAnnotation(uri="obm:userHasFirstName")
	public String firstName;
	
	@OntologyModelAnnotation(uri="obm:userHasLastName")
	public String lastName;
	
	@OntologyModelAnnotation(uri="obm:userHasPassword")
	public String password;
	
	public String userURI;
	
	@OntologyModelAnnotation(uri="obm:userHasCreationDateTime")
	public String creationTime;
	
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
}
