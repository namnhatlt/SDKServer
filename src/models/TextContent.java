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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ArrayList<Button> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<Button> buttons) {
		this.buttons = buttons;
	}
}
