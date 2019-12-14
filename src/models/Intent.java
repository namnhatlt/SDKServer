package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Intent {
	
	@JsonProperty("label")
	private String label;

	@JsonProperty("confidence")
	private int confidence;
	
	public String getLabel() {
		return this.label;
	}
	
	public void setLabel(String label) {
		this.label = label; 
	}
	
	public int getConfidence() {
		return this.confidence;
	}
	
	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}
	
}
