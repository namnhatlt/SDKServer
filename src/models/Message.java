package models;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;


import exception.InValidMessageTypeException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
	
	@JsonProperty("type")
	private String type;

	@JsonProperty("content")
	private Object content;

	/**
	 * Get type of message
	 * @return type of message
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set type of message
	 * @param type 
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get content of message
	 * @return content of message
	 */
	public Object getContent() {
		return content;
	}

	/**
	 * Set content of message
	 * @param content
	 */
	public void setContent(Object content) {
		this.content = content;
	}

	public Message() {
		super();
	}

	/**
	 * Constructor with 2 parameters
	 * @param type
	 * @param content
	 */
	public Message(String type, Object content) {
		this.type = type;
		this.content = content;
	}

//	Get content as Message type
	
	// Text message
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

	// Image message
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

	// Carousel message
//	@JsonIgnore
//	public CarouselContent getContentAsCarouselMessage() throws InValidMessageTypeException {
//		ObjectMapper objectMapper = new ObjectMapper();
//		String json;
//		try {
//			json = objectMapper.writeValueAsString(content);
//			return (CarouselContent) objectMapper.readValue(json, CarouselContent.class);
//		} catch (IOException e) {
//			throw new InValidMessageTypeException("Message content is not carousel message", e);
//		}
//	}

	// Form message
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

	// Quick reply message
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
