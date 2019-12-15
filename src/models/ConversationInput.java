package models;

import org.codehaus.jackson.annotate.JsonProperty;

public class ConversationInput {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("content")
	private String content;

	/**
	 * Get type
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set type
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get content
	 * @return content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Set content
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
