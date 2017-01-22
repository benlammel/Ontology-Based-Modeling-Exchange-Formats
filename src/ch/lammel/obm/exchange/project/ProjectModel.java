package ch.lammel.obm.exchange.project;

import java.util.ArrayList;


public class ProjectModel {

	private String projectName;

	private String projectDescription;

	private ArrayList<String> userHasAccess;

	private String creationDateTime;

	private String projectCreator;

	private String projectURI;

	public ProjectModel() {
		userHasAccess = new ArrayList<String>();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n==ProjectModel==\n");
		sb.append("projectName: \t" + projectName + "\n");
		sb.append("projectDescription: \t" + projectDescription + "\n");
		sb.append("userHasAccess: \t" + userHasAccess.toString() + "\n");
		sb.append("projectCreator: \t" + projectCreator + "\n");
		sb.append("creationDateTime: \t" + creationDateTime + "\n");
		sb.append("****End ProjectModel****\n");
		return sb.toString();
	}

	public void setProjectURI(String uri) {
		this.projectURI = uri;
	}

	public void setCreationDateTime(String creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

}
