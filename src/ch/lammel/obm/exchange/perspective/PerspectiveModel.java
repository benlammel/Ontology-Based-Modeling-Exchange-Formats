package ch.lammel.obm.exchange.perspective;

public class PerspectiveModel {

	private String name;
	private String description;
	private String uri;
	private String creationDateTime;
	private String creator;

	public PerspectiveModel() {
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n==Perspective==\n");
		sb.append("name: \t" + getName() + "\n");
		sb.append("description: \t" + getDescription() + "\n");
		sb.append("uri: \t" + getURI() + "\n");
		sb.append("creator: \t" + getCreator() + "\n");
		sb.append("creationDateTime: \t" + getCreationDateTime() + "\n");
		sb.append("****End ProjectModel****\n");
		return sb.toString();
	}

	public void setPerspectiveName(String perspectiveName) {
		this.name = perspectiveName;
	}

	public String getName() {
		return name;
	}
	
	public void setPerspectiveDescription(String perspectiveDescription) {
		this.description = perspectiveDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setPerspectiveURI(String perspectiveURI) {
		this.uri = perspectiveURI;
	}
	
	public String getURI() {
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
	
	public String getCreator() {
		return creator;
	}
}
