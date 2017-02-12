package ch.lammel.obm.exchange.ontology;

@Deprecated
public class ClassObjectModel {

	private String targetClass;
	private String subclass;
	private NamespaceModel subclassNamespace;
	private NamespaceModel targetClassNamespace;
	private int transactionType;

	public String getTargetClass() {
		return targetClass;
	}

	public String getSubclass() {
		return subclass;
	}

	public NamespaceModel getTargetClassNamespace() {
		return targetClassNamespace;
	}

	public NamespaceModel getSubclassNamespace() {
		return subclassNamespace;
	}

}

