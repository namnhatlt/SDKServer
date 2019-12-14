package models;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import exception.InValidMessageTypeException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
	
	// type of message
	@JsonProperty("type")
	private String type;
	
	// content of message
	@JsonProperty("content")
	private Object content;
	
	/**
	 * get type of message
	 * @return type of message
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * set type of message
	 * @param type is type of message
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * get content of message
	 * @return content of message
	 */
	public Object getContent() {
		return content;
	}

	/**
	 * set content of message
	 * @param content is content of message
	 */
	public void setContent(Object content) {
		this.content = content;
	}
	
	// constructor
	public Message(String type, Object content) {
		this.type = type;
		this.content = content;
	}
	
	// Get content of text message
	@JsonIgnore
	public TextContent getContentAsTextMessage() throws InValidMessageTypeException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json;
		try {
			json = objectMapper.writeValueAsString(content);
			return (TextContent) objectMapper.readValue(json, TextContent.class);
		} catch (IOException e) {
			throw new InValidMessageTypeException("Message content is not text message", e);
		}
	}
	
	// Get content of image message
	@JsonIgnore
	public ImageContent getContentAsImageMessage() throws InValidMessageTypeException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json;
		try {
			json = objectMapper.writeValueAsString(content);
			return (ImageContent) objectMapper.readValue(json, ImageContent.class);
		} catch (IOException e) {
			throw new InValidMessageTypeException("Message content is not image message", e);
		}
	}
	
	// Get content of carousel message 
	@JsonIgnore
	public CarouselContent getContentAsCarouselMessage() throws InValidMessageTypeException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json;
		try {
			json = objectMapper.writeValueAsString(content);
			return (CarouselContent) objectMapper.readValue(json, CarouselContent.class);
		} catch (IOException e) {
			throw new InValidMessageTypeException("Message content is not carousel message", e);
		}
	}

	// Get content of form message
	@JsonIgnore
	public TextContent getContentAsFormMessage() throws InValidMessageTypeException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json;
		try {
			json = objectMapper.writeValueAsString(content);
			return (TextContent) objectMapper.readValue(json, TextContent.class);
		} catch (IOException e) {
			throw new InValidMessageTypeException("Message content is not form message", e);
		}
	}
	
	// Get content of quick reply message
	@JsonIgnore
	public TextContent getContentAsQuickReplyMessage() throws InValidMessageTypeException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json;
		try {
			json = objectMapper.writeValueAsString(content);
			return (TextContent) objectMapper.readValue(json, TextContent.class);
		} catch (IOException e) {
			throw new InValidMessageTypeException("Message content is not quick reply message", e);
		}
	}
}
