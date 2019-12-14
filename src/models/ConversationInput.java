package models;

import org.codehaus.jackson.annotate.JsonProperty;

public class ConversationInput {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("content")
	private String content;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}