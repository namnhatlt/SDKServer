package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BotResponse {
	@JsonProperty("app_code")
	private String appCode;
	
	@JsonProperty("sender_id")
	private String sender_id;
	
	@JsonProperty("channel")
	private String channel;
	
	@JsonProperty("sender_data")
	private String senderData;
	
	@JsonProperty("answer_source")
	private String answerSource;
	
	@JsonProperty("conversation_input")
	private ConversationInput conversationInput;
	
	@JsonProperty("predict_history")
	private PredictHistory predictHistory;
	
	private ArrayList<Message> messages;

	/**
	 * Get app code
	 * @return appCode
	 */
	public String getAppCode() {
		return appCode;
	}

	/**
	 * Set app code
	 * @param appCode
	 */
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	/**
	 * Get sender id
	 * @return sender_id
	 */
	public String getSender_id() {
		return sender_id;
	}

	/**
	 * Set sender id
	 * @param sender_id
	 */
	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}

	/**
	 * Get channel
	 * @return channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Set channel
	 * @param channel
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * Get sender data
	 * @return senderData
	 */
	public String getSenderData() {
		return senderData;
	}

	/**
	 * Set sender data
	 * @param senderData
	 */
	public void setSenderData(String senderData) {
		this.senderData = senderData;
	}

	/**
	 * Get answer source
	 * @return answerSource
	 */
	public String getAnswerSource() {
		return answerSource;
	}

	/**
	 * Set answer source
	 * @param answerSource
	 */
	public void setAnswerSource(String answerSource) {
		this.answerSource = answerSource;
	}

	/**
	 * Get conversation input
	 * @return conversationInput
	 */
	public ConversationInput getConversationInput() {
		return conversationInput;
	}

	/**
	 * Set conversation input
	 * @param conversationInput
	 */
	public void setConversationInput(ConversationInput conversationInput) {
		this.conversationInput = conversationInput;
	}

	/**
	 * Get predic history
	 * @return predicHistory
	 */
	public PredictHistory getPredictHistory() {
		return predictHistory;
	}

	/**
	 * Set predic history
	 * @param predictHistory
	 */
	public void setPredictHistory(PredictHistory predictHistory) {
		this.predictHistory = predictHistory;
	}

	/**
	 * Get messages
	 * @return messages
	 */
	public ArrayList<Message> getMessages() {
		return messages;
	}

	/**
	 * Set messages
	 * @param messages
	 */
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}
}
