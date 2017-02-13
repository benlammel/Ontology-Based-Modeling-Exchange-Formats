package ch.lammel.obm.exchange.perspective;

public class PerspectiveModel {

	private String name;
	private String description;
	private String uri;
	private String creationDateTime;
	private String creator;

	public PerspectiveModel() {
	}

//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append("\n==ProjectModel==\n");
//		sb.append("projectName: \t" + projectName + "\n");
//		sb.append("projectDescription: \t" + projectDescription + "\n");
//		sb.append("userHasAccess: \t" + userHasAccess.toString() + "\n");
//		sb.append("projectCreator: \t" + projectCreator + "\n");
//		sb.append("creationDateTime: \t" + creationDateTime + "\n");
//		sb.append("****End ProjectModel****\n");
//		return sb.toString();
//	}

	public void setPerspectiveName(String perspectiveName) {
		this.name = perspectiveName;
	}

	public String getPerspectiveName() {
		return name;
	}
	
	public void setPerspectiveDescription(String perspectiveDescription) {
		this.description = perspectiveDescription;
	}

	public String getPerspectiveDescription() {
		return description;
	}

	public void setPerspectiveURI(String perspectiveURI) {
		this.uri = perspectiveURI;
	}
	
	public String getPerspectiveURI() {
		return uri;
	}

	public void setCreationDateTime(String perspectiveCreationDateTime) {
		this.creationDateTime = perspectiveCreationDateTime;
	}
	
	public String getCreationDateTime() {
		return creationDateTime;
	}

	public void setPerspectiveCreator(String perspectiveCreator) {
		this.creator = perspectiveCreator;
	}
	
	public String getPerspectiveCreator() {
		return creator;
	}
}
