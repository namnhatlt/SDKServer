package models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	@JsonProperty("intents")
	private List<Intent> intents;
	
	@JsonProperty("entities")
	private List<Object> entities;

	public List<Intent> getIntents() {
		return intents;
	}

	public void setIntents(List<Intent> intents) {
		this.intents = intents;
	}

	public List<Object> getEntities() {
		return entities;
	}

	public void setEntities(List<Object> entities) {
		this.entities = entities;
	}
}
