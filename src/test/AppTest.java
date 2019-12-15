package test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import models.BotConstant;
import models.BotManager;
import models.BotManager;


/**
 * Unit test for simple App.
 */
public class AppTest {
	// Application url
	String bot_host = "https://4bc7c6a2.ngrok.io";

	// Bot token
	String bot_token = "4c4687d95d0e75f72b76b5a0ab33738b";

	// Bot channel
	String channel = BotConstant.CHANNEL_API;
	BotManager bmn = new BotManager(bot_host, bot_token, channel);

//	// Payload message
//	@Test
//	public void testSendPayLoadRequest() {
//
//		// Create payload
//		HashMap<String, String> attributes = new HashMap<>();
//
//		// Add attribute
//		attributes.put("name", "chatbot");
//
//		// Go to step
//		String step_name = "Step";
//
//		// User id
//		String sender_id = "5d7d5b30acb2a068698aeb2ed7176075";
//		
//		// Send message to sender_id 
//		assertEquals(bmn.buildPayLoadMessage(step_name, attributes).sendMessage(sender_id), "Success");
//	}
	
	public void setBotCode(BotManager bot, String botCode) {
		bot.setBotCode(botCode);
	}

	// Text message
	@Test
	public void testSendTextRequest() {
		// Content
		String content = "Cảm ơn";

		// User id
		String sender_id = "5d7d5b30acb2a068698aeb2ed7176075";
		
		// Send message to sender_id 
		assertEquals(bmn.buildTextMessage(content).sendMessage(sender_id), "Success");
	}

}