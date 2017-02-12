package ch.lammel.obm.exchange.ontology;

public class OntologyResourceCRUDModel {
	
	private OntologyResourceModel resource1;
	private OntologyResourceModel resource2;

	public OntologyResourceModel getResource1() {
		return resource1;
	}

	public OntologyResourceModel getResource2() {
		return resource2;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n==OntologyResourceCRUDModel==\n");
		sb.append("resource1: \t" + resource1.toString() + "\n");
		sb.append("resource2: \t" + resource2.toString() + "\n");
		sb.append("****End ProjectModel****\n");
		return sb.toString();
	}

}
