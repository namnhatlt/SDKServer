package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarouselCard {
	@JsonProperty("image_url")
	private String imageUrl;
	
	@JsonProperty("subtitle")
	private String subtitle;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("buttons")
	private ArrayList<Button> buttons;
	
	@JsonProperty("item_url")
	private String itemUrl;

	/**
	 * Get image url
	 * @return image url
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * Set image url
	 * @param imageUrl
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * Get subtitle
	 * @return sub title
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * Set subtitle
	 * @param subtitle
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

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

	/**
	 * Get item url
	 * @return item url
	 */
	public String getItemUrl() {
		return itemUrl;
	}

	/**
	 * Set item Url
	 * @param itemUrl
	 */
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}
}
