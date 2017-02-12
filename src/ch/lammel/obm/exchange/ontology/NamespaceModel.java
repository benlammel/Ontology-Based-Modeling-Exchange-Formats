package ch.lammel.obm.exchange.ontology;

@Deprecated
public class NamespaceModel {

	private String namespace;
	private String prefix;

	public String getNamespace() {
		return namespace;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
