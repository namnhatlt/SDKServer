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
	// Địa chỉ của chat bot
	String bot_host = "https://4bc7c6a2.ngrok.io";

	// Token của chat bot
	String bot_token = "4c4687d95d0e75f72b76b5a0ab33738b";

	// Channel của chat bot bao gồm:
	// CHANNEL_API, CHANNEL_FACEBOOK, CHANNEL_LIVECHAT,
	// CHANNEL_ZALO,CHANNEL_VIBER,CHANNEL_FACEBOOK_AT_WORK
	String channel = BotConstant.CHANNEL_API;
	BotManager bmn = new BotManager(bot_host, bot_token, channel);

	// Gửi tin nhắn dạng payload
	@Test
	public void testSendPayLoadRequest() {

		// Tạo nội dung payload
		HashMap<String, String> attributes = new HashMap<>();

		// Gán biến name = chatbot trên
		attributes.put("name", "chatbot");

		// Đi đến bước Step
		String step_name = "Step";

		// ID của người tham gia chat
		String sender_id = "5d7d5b30acb2a068698aeb2ed7176075";
		// Gửi message tới sender_id đã được chỉ định
		assertEquals(bmn.buildPayLoadMessage(step_name, attributes).sendMessage(sender_id), "Success");
	}
	
	public void setBotCode(BotManager bot, String botCode) {
		bot.setBotCode(botCode);
	}

	// Gửi tin nhắn dạng text
	@Test
	public void testSendTextRequest() {
		// Nội dung tin nhắn
		String content = "Cảm ơn";

		// ID của người tham gia chat
		String sender_id = "5d7d5b30acb2a068698aeb2ed7176075";
		
		// Gửi message tới sender_id đã được chỉ định
		assertEquals(bmn.buildTextMessage(content).sendMessage(sender_id), "Success");
	}

}