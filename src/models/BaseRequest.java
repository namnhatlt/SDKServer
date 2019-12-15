package models;

import org.codehaus.jackson.annotate.JsonProperty;

public class BaseRequest {
	// Channel request
	@JsonProperty("channel")
	private String channel;
	
	@JsonProperty("app_code")
	private String app_code;
	
	@JsonProperty("sender_id")
	private String sender_id;
	
	@JsonProperty("message")
	private Message message;
	
	/**
	 * Get channel request
	 * @return channel request
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Set channel request
	 * @param channel of request
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * Get app code
	 * @return app code
	 */
	public String getAppCode() {
		return app_code;
	}

	/**
	 * Set app code
	 * @param app_code
	 */
	public void setAppCode(String app_code) {
		this.app_code = app_code;
	}

	/**
	 * Get sender Id
	 * @return sender Id
	 */
	public String getSenderId() {
		return sender_id;
	}

	/**
	 * Set sender Id
	 * @param sender_id
	 */
	public void setSenderId(String sender_id) {
		this.sender_id = sender_id;
	}
	
	/**
	 * Get message
	 * @return message
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * Set message
	 * @param message
	 */
	public void setMessage(Message message) {
		this.message = message;
	}

	/**
	 * Constructor with 4 parameters
	 * @param channel
	 * @param app_code
	 * @param sender_id
	 * @param message
	 */
	public BaseRequest(String channel, String app_code, String sender_id, Message message) {
		this.channel = channel;
		this.app_code = app_code;
		this.sender_id = sender_id;
		this.message = message;
	}
	
	/**
	 * Constructor with 2 parameters
	 * @param channel
	 * @param app_code
	 */
	public BaseRequest(String channel, String app_code) {
		this.channel = channel;
		this.app_code = app_code;
	}
}
