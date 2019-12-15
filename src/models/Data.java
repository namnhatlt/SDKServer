package models;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Data {
	@JsonProperty("intents")
	private List<Intent> intents;
	
	@JsonProperty("entities")
	private List<Object> entities;

	/**
	 * Get intents
	 * @return intents
	 */
	public List<Intent> getIntents() {
		return intents;
	}

	/**
	 * Set intents
	 * @param intents
	 */
	public void setIntents(List<Intent> intents) {
		this.intents = intents;
	}

	/**
	 * Get entities
	 * @return entities
	 */
	public List<Object> getEntities() {
		return entities;
	}

	/**
	 * Set entities
	 * @param entities
	 */
	public void setEntities(List<Object> entities) {
		this.entities = entities;
	}
}
