package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageContent {
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("url")
	private String url;

	@JsonProperty("buttons")
	private ArrayList<Button> buttons;

	/**
	 * Get title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set title
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get url
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set url
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
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
