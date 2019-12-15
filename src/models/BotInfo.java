package models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BotInfo {
	private String name;
	private String description;
	private String code;
	private String token;
	private String language;
	private Date last_activity;
	private Date last_train_time;
	private Date created_time;
	
	/**
	 * Get bot name
	 * @return bot name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set bot name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get bot description
	 * @return bot description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Set bot description
	 * @param description 
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Get bot code
	 * @return bot code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * Set bot code
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * Get bot token
	 * @return bot token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * Set bot token
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * Get language
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}
	
	/**
	 * Set language
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/**
	 * Get last activity
	 * @return last activity
	 */
	public Date getLast_activity() {
		return last_activity;
	}
	
	/**
	 * Set last activity
	 * @param last_activity
	 */
	public void setLast_activity(Date last_activity) {
		this.last_activity = last_activity;
	}
	
	/**
	 * Get last train time
	 * @return last train time
	 */
	public Date getLast_train_time() {
		return last_train_time;
	}
	
	/**
	 * Set last train time
	 * @param last_train_time
	 */
	public void setLast_train_time(Date last_train_time) {
		this.last_train_time = last_train_time;
	}
	
	/**
	 * Get created time
	 * @return created time
	 */
	public Date getCreated_time() {
		return created_time;
	}
	
	/**
	 * Set created time
	 * @param created_time
	 */
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
}
