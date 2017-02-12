package ch.lammel.obm.exchange.model;

import java.util.ArrayList;
import java.util.List;

public class OBMModel {
	
	private List<OBMModelElement> elementList;
	private String label;
	private String uri;

	public OBMModel(){
		elementList = new ArrayList<OBMModelElement>();
	}

	public String getLabel(){
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setURI(String uri) {
		this.uri = uri;
	}
	
	public List<OBMModelElement> getElementList(){
		return elementList;
	}
	
	public void addElement(OBMModelElement element) {
		this.elementList.add(element);
	}
	
	public String getURI() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setElementList(List<OBMModelElement> elementList) {
		this.elementList = elementList;
	}

}
