package ch.lammel.obm.exchange.usermanagement;

import ch.lammel.obm.exchange.interfaces.OntologyBasedModelingExchangeFormatInterface;
import ch.lammel.obm.exchange.interfaces.OntologyModelAnnotation;
import ch.lammel.obm.security.UserRoles;

@OntologyModelAnnotation(uri="obm:User", readAccess = { UserRoles.PROJECTUSER }, writeAccess = {
		UserRoles.SYSTEMSUPERUSER })
public class UserModel implements OntologyBasedModelingExchangeFormatInterface {
	
	@OntologyModelAnnotation(uri="obm:userHasEmail", readAccess = { UserRoles.PROJECTUSER }, writeAccess = {
			UserRoles.SYSTEMSUPERUSER })
	public String email;
	
	@OntologyModelAnnotation(uri="obm:userHasFirstName", readAccess = { UserRoles.PROJECTUSER }, writeAccess = {
			UserRoles.SYSTEMSUPERUSER })
	public String firstName;
	
	@OntologyModelAnnotation(uri="obm:userHasLastName", readAccess = { UserRoles.PROJECTUSER }, writeAccess = {
			UserRoles.SYSTEMSUPERUSER })
	public String lastName;
	
	@OntologyModelAnnotation(uri="obm:userHasPassword", readAccess = { UserRoles.PROJECTUSER }, writeAccess = {
			UserRoles.SYSTEMSUPERUSER })
	public String password;
	
	public String userURI;
	
	@OntologyModelAnnotation(uri="obm:userHasCreationDateTime", readAccess = { UserRoles.PROJECTUSER }, writeAccess = {
			UserRoles.SYSTEMSUPERUSER })
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
