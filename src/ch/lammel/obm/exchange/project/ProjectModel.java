package ch.lammel.obm.exchange.project;

import java.util.ArrayList;


public class ProjectModel {

	private String name;
	private String description;
	private ArrayList<String> userHasAccess;
	private String creationDateTime;
	private String creator;
	private String uri;

	public ProjectModel() {
		userHasAccess = new ArrayList<String>();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n==ProjectModel==\n");
		sb.append("projectName: \t" + name + "\n");
		sb.append("projectDescription: \t" + description + "\n");
		sb.append("userHasAccess: \t" + userHasAccess.toString() + "\n");
		sb.append("projectCreator: \t" + creator + "\n");
		sb.append("creationDateTime: \t" + creationDateTime + "\n");
		sb.append("****End ProjectModel****\n");
		return sb.toString();
	}

	public void setProjectURI(String uri) {
		this.uri = uri;
	}

	public void setCreationDateTime(String creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public void setProjectName(String projectName) {
		this.name = projectName;
	}

	public void setProjectDescription(String projectDescription) {
		this.description = projectDescription;
	}

	public String getProjectName() {
		return name;
	}

	public String getProjectDescription() {
		return description;
	}

}
