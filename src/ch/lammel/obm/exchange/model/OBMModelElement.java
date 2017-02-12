package ch.lammel.obm.exchange.model;

public class OBMModelElement {

	private String label;
	private String uri;
	private String SVGData;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getURI() {
		return uri;
	}

	public void setURI(String uri) {
		this.uri = uri;
	}

	public void setSVGData(String SVGData) {
		this.SVGData = SVGData;
	}
	
	public String getSVGData() {
		return SVGData;
	}

}
