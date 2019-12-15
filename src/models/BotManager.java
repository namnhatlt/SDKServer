package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.HashMap;

import javax.net.ssl.HttpsURLConnection;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;

import models.BaseRequest;
import models.Message;

public class BotManager {
	private static Logger logger = LoggerFactory.getLogger(BotManager.class);

	private String botHost = "https://bot.fpt.ai";
	private String botToken;
	private String apiChatBot = "/api/get_answer/";
	private String apiBotInfo = "/api/bot_info/";
	private String channel = "api";
	private String botCode;

	private BaseRequest baseRequest;

	/**
	 * Get bot host
	 * @return bot host
	 */
	public String getBotHost() {
		return botHost;
	}

	/**
	 * Set bot host
	 * @param botHost 
	 */
	public void setBotHost(String botHost) {
		this.botHost = botHost;
	}

	/**
	 * Get bot token
	 * @return bot token
	 */
	public String getBotToken() {
		return botToken;
	}

	/**
	 * Set bot token
	 * @param botToken
	 */
	public void setBotToken(String botToken) {
		this.botToken = botToken;
	}

	/**
	 * Get API
	 * @return API Chatbot
	 */
	public String getApiChatBot() {
		return apiChatBot;
	}

	/**
	 * Set apiChatBot
	 * @param apiChatBot
	 */
	public void setApiChatBot(String apiChatBot) {
		this.apiChatBot = apiChatBot;
	}
	
	/**
	 * Get API bot info
	 * @return API bot info
	 */
	public String getApiBotInfo() {
		return apiBotInfo;
	}

	/**
	 * Set API bot info
	 * @param apiBotInfo
	 */
	public void setApiBotInfo(String apiBotInfo) {
		this.apiBotInfo = apiBotInfo;
	}

	/**
	 * Get bot channel
	 * @return bot channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Set bot channel
	 * @param channel
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * Get base request
	 * @return base request
	 */
	public BaseRequest getBaseRequest() {
		return baseRequest;
	}
	/**
	 * Set Base Request
	 * @param baseRequest
	 */
	public void setBaseRequest(BaseRequest baseRequest) {
		this.baseRequest = baseRequest;
	}
	
	/**
	 * Set bot code
	 * @param botCode
	 */
	public void setBotCode(String botCode) {
		this.botCode = botCode;
	}

	/**
	 * Constructor with 5 parameters
	 * @param bot_host
	 * @param api_chat_bot
	 * @param api_bot_info
	 * @param bot_token
	 * @param channel
	 */
	public BotManager(String bot_host, String api_chat_bot, String api_bot_info, String bot_token, String channel) {
		this.botHost = bot_host;
		this.botToken = bot_token;
		this.apiChatBot = api_chat_bot;
		this.apiBotInfo = api_bot_info;
		this.channel = channel;
		this.botCode = getBotCode();
		this.baseRequest = new BaseRequest(this.channel, this.botCode);
	}

	/**
	 * Constructor with 3 parameters
	 * @param bot_host
	 * @param bot_token
	 * @param channel
	 */
	public BotManager(String bot_host, String bot_token, String channel) {
		this.botHost = bot_host;
		this.botToken = bot_token;
		this.channel = channel;
		this.botCode = getBotCode();
		this.baseRequest = new BaseRequest(this.channel, this.botCode);
	}

	/**
	 * Constructor with 2 parameters
	 * @param bot_token
	 * @param channel
	 */
	public BotManager(String bot_token, String channel) {
		this.botToken = bot_token;
		this.channel = channel;
		this.botCode = getBotCode();
		this.baseRequest = new BaseRequest(this.channel, this.botCode);
	}

	/**
	 * Constructor with 1 parameter
	 * @param bot_token
	 */
	public BotManager(String bot_token) {
		this.botToken = bot_token;
		this.botCode = getBotCode();
		this.baseRequest = new BaseRequest(this.channel, this.botCode);
	}

	public BotManager() {
		
	}

	// Build text message
	public BotManager buildTextMessage(String content) {
		Message ms = new Message("text", content);
		this.baseRequest.setMessage(ms);
		return this;
	}
	
	// Build text message
	public BotManager buildPayLoadMessage(String step_name, HashMap<String, String> attributes) {
		String payload = new Payload(attributes).build();
		String content = "";
		if (step_name != null) {
			content = String.valueOf(content) + step_name + "#";
		}
		content = String.valueOf(content) + Base64.getEncoder().encodeToString(payload.getBytes());
		Message ms = new Message("payload", content);
		this.baseRequest.setMessage(ms);
		return this;
	}

	// Send message
	public String sendMessage(String sender_id) {
		this.baseRequest.setSenderId(sender_id);
		ObjectMapper Obj = new ObjectMapper();
		String request;
		try {
			request = Obj.writeValueAsString(this.baseRequest);
			URL url = new URL(String.valueOf(this.botHost) + this.apiChatBot);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Authorization", "Bearer " + this.botToken);
			OutputStream os = conn.getOutputStream();
			os.write(request.getBytes());
			os.flush();
			if (conn.getResponseCode() != 200) {
				logger.error("Failed to sent message: {}", conn.getResponseCode());
				return "Failed";
			}
			os.close();
			conn.disconnect();
			return "Success";
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Failed";

	}

	// Convert response to object
	public BotResponse parseResponse(String response) {
		ObjectMapper objectMapper = new ObjectMapper();
		BotResponse res = null;
		try {
			res = (BotResponse) objectMapper.readValue(response, BotResponse.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * Get bot code
	 * @return bot code
	 */
	private String getBotCode() {
		URL url;
		try {
			url = new URL(String.valueOf(this.botHost) + this.apiBotInfo);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Authorization", "Bearer " + this.botToken);
			if (conn.getResponseCode() != 200) {
				logger.warn("Cannot get bot info from {}, HTTP code: {}", this.botHost + this.apiBotInfo,
						conn.getResponseCode());
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			ObjectMapper mapper = new ObjectMapper();
			mapper.setDateFormat(df);
			BotInfo botInfo = mapper.readValue(br, BotInfo.class);
			br.close();
			conn.disconnect();
			return botInfo.getCode();
		} catch (IOException e) {
			logger.error("Bot info empty or invalid bot host");
			e.printStackTrace();
		}
		return "";
	}
}
