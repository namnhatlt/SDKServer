package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Button {
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("payload")
	private String payload;
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("phone_number")
	private String phoneNumber;
	
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
	 * Get payload
	 * @return payload
	 */
	public String getPayload() {
		return payload;
	}
	
	/**
	 * Set payload
	 * @param payload
	 */
	public void setPayload(String payload) {
		this.payload = payload;
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
	 * Get phone number
	 * @return phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Set phone number
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
