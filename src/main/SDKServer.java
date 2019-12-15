package main;

import static spark.Spark.get;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import models.BotResponse;
import models.Message;
import models.BotConstant;
import models.BotManager;

import org.apache.http.NameValuePair;

public class SDKServer {
	
	// sendPost use to send values from Bot engine to IOS application through webhook
	private static void sendPost(List<String> messages, String userId) throws Exception {
		JSONObject json = new JSONObject();
		// User id
		json.put("user_id", userId);
		// Messages
		json.put("messages", messages.toString());
		
		// Application URL
		HttpPost post = new HttpPost("http://localhost:3000/webhook");
		
		List<NameValuePair> urlParameters = new ArrayList<>();
		urlParameters.add(new BasicNameValuePair("user_id", userId));
        urlParameters.add(new BasicNameValuePair("messages", messages.toString()));
        
        post.setEntity(new UrlEncodedFormEntity(urlParameters, "UTF-8"));	
        
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {
        	System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
        	e.printStackTrace();
        	System.out.print(e);
        }
		
	}
	
    public static void main(String[] args){

    	// Post method for application to get parameter from SDK
        post("/receive-response", (request, reponse) -> {
        	
        	// Bot manager
        	BotManager bm = new BotManager();
            
            // Response bot engine send to webhook
            String botResponse = request.body();
            
            // Convert response to Object
            BotResponse resToObj = bm.parseResponse(botResponse);
            
            // List response message from bot engine to webhook
            List<Message> msg = resToObj.getMessages();
            
            // List raw message 
            List<String> rawMsg = new ArrayList<>();
            
            for(Message message : msg) {
            	
            	// get type of message
            	String messageType = message.getType();
            	
            	switch(messageType) {
            		// Text message Object
            		case BotConstant.TEXT_MESSAGE:
            			System.out.println(message.getContentAsTextMessage().getText());
            			rawMsg.add(message.getContentAsTextMessage().getText());
            			break;
            		// Image message Object
            		case BotConstant.IMAGE_MESSAGE:
            			System.out.println(message.getContentAsImageMessage().getUrl());
            			rawMsg.add(message.getContentAsImageMessage().getUrl());
            			break;
            		// Carousel message Object
//            		case BotConstant.CAROUSEL_MESSAGE:
//            			System.out.println(message.getContentAsCarouselMessage().getCarouselCards());
//            			rawMsg.add(message.getContentAsCarouselMessage().getCarouselCards().get(0).getImageUrl());
//            			break;
//            		// Form message
//            		case BotConstant.FORM_MESSAGE:
//            			System.out.println(message.getContentAsFormMessage().getText());
//            			rawMsg.add(message.getContentAsFormMessage().getText());
//            			break;
            		// Quick reply message Object
            		case BotConstant.QUICK_REPLY_MESSAGE:
            			System.out.println(message.getContentAsQuickReplyMessage().getText());
            			rawMsg.add(message.getContentAsQuickReplyMessage().getText());
            			break;
            		default:
            			break;	
            	}
            }
            sendPost(rawMsg, resToObj.getSender_id());
            return "";
        });
        
        // Get method to check connection between bot engine and webhook
        get("/receive-response", (request, response) -> {
        	return "0df2e72e-cef8-11e9-bb65-2a2ae2dbcce4";
        });
    }
}
