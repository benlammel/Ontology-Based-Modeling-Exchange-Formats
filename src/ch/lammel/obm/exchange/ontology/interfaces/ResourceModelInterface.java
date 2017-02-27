package ch.lammel.obm.exchange.ontology.interfaces;

import java.util.Set;

public interface ResourceModelInterface {
	
	public void setNamespace(String namespace);
	public String getNamespace();
	
	public void setPrefix(String prefix);
	public String getPrefix();
	
	public void setURI(String uri);
	public String getURI();
	
	public void setLabel(String label);
	public String getLabel();
	
	public void setDescription(String description);
	public String getDescription();
	
	public void setParents(Set<String> parents);
	public Set<String> getParents();
	
	public void addParent(String parentID);
	public void removeParent(String parentID);

}
