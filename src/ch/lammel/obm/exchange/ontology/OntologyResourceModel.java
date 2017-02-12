package ch.lammel.obm.exchange.ontology;

public class OntologyResourceModel {
	
	private String resourceName;
	private String resourceLabel;
	private String namespacePrefix;
	private String resourceURI;
	private String namespaceURI;
	
	public String getResourceURI() {
		return resourceURI;
	}

	public String getNamespacePrefix() {
		return namespacePrefix;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public void setNamespacePrefix(String resourcePrefix) {
		this.namespacePrefix = resourcePrefix;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setNamespaceURI(String namespaceURI) {
		this.namespaceURI = namespaceURI;
	}

	public String getLabel() {
		return resourceLabel;
	}
	
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	public String getNamespaceURI() {
		return namespaceURI;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n==Resource==\n");
		sb.append("getLabel: \t" + getLabel() + "\n");
		
		sb.append("getResourceURI: \t" + getResourceURI() + "\n");
		sb.append("getResourceName: \t" + getResourceName() + "\n");

		sb.append("getNamespacePrefix: \t" + getNamespacePrefix() + "\n");
		sb.append("getNamespaceURI: \t" + getNamespaceURI() + "\n");
		return sb.toString();
	}

}
