package ch.lammel.obm.exchange.ontology.models;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import ch.lammel.obm.exchange.ontology.interfaces.ResourceModelInterface;

public class ResourceModel implements ResourceModelInterface, Comparable<ResourceModel> {
	
	private String uri;
	private String label;
    private String description;
	private Set<String> parents;
	private String namespace;
	private String prefix;
    
    public ResourceModel() {
    	parents = new HashSet<String>();
	}
	
	public ResourceModel(String uri, String label) {
		this();
		this.uri = uri;
		this.label = label;
	}
	
	public ResourceModel(String uri, String label, String description) {
		this(uri, label);
		this.description = description;
	}

	public void setURI(String id) {
		this.uri = id;
	}

	public void setLabel(String name) {
		this.label = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getURI() {
		return uri;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setParents(Set<String> parents) {
		this.parents = parents;
	}

	@Override
	public Set<String> getParents() {
		return this.parents;
	}

	@Override
	public void addParent(String parentID) {
		this.parents.add(parentID);
	}

	@Override
	public void removeParent(String parentID) {
		this.parents.remove(parentID);
	}

	@Override
	public int compareTo(ResourceModel s) {
		int d = getLabel().compareTo(s.getLabel());
		if (d == 0)
		    d = getURI().compareTo(s.getURI());
		return d;
	}

	@Override
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	@Override
	public String getNamespace() {
		return namespace;
	}

	@Override
	public void setPrefix(String prefix) {
		this.prefix = prefix;
		
	}

	@Override
	public String getPrefix() {
		return prefix;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass().getName() +"\n");
		sb.append(this.getClass().getSimpleName() +"\n");
		for(Field item : this.getClass().getDeclaredFields()){
			try {
				sb.append(item.getName() +"\t:::::" +item.get(this) +"::::\n");
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
}
