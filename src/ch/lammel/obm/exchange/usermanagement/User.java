package ch.lammel.obm.exchange.usermanagement;

public class User {
	
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	
	public User(){
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("= User =\n");
		sb.append("email: \t" +getEmail()+"\n");
		sb.append("First Name: \t" +getFirstName()+"\n");
		sb.append("Last Name: \t" +getLastName()+"\n");
		sb.append("Password: \t" +getPassword()+"\n");
		return sb.toString();
	}
}
