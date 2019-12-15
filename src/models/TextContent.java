package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TextContent {
	@JsonProperty("text")
	private String text;
	
	@JsonProperty("buttons")
	private ArrayList<Button> buttons;

	/**
	 * Get text content
	 * @return text
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Set text content
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Get buttons
	 * @return buttons
	 */
	public ArrayList<Button> getButtons() {
		return buttons;
	}

	/**
	 * Set buttons
	 * @param buttons
	 */
	public void setButtons(ArrayList<Button> buttons) {
		this.buttons = buttons;
	}
}
