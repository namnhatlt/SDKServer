package models;

import org.codehaus.jackson.annotate.JsonProperty;

public class Intent {
	
	@JsonProperty("label")
	private String label;

	@JsonProperty("confidence")
	private int confidence;
	
	/**
	 * Get label
	 * @return label
	 */
	public String getLabel() {
		return this.label;
	}
	
	/**
	 * Set label
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label; 
	}
	
	/**
	 * Get confidence
	 * @return confidence
	 */
	public int getConfidence() {
		return this.confidence;
	}
	
	/**
	 * Set confidence
	 * @param confidence
	 */
	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}
	
}
