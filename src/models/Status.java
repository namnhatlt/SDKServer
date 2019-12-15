package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {
	@JsonProperty("code")
	private int code;
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("module")
	private String module;
	
	@JsonProperty("api_code")
	private int apiCode;
	
	@JsonProperty("err_code")
	private int errCode; 
	
	@JsonProperty("detail")
	private String detail;
	
	@JsonProperty("app_code")
	private String appCode;
	
	@JsonProperty("button_title")
	private String buttonTitle;

	/**
	 * Get code
	 * @return code
	 */
	public int getCode() {
		return code;
	}
	
	/**
	 * Set code
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * Get message
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Set message
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Get module
	 * @return module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * Set module
	 * @param module
	 */
	public void setModule(String module) {
		this.module = module;
	}
	
	/**
	 * Get API code
	 * @return API code
	 */
	public int getApiCode() {
		return apiCode;
	}
	
	/**
	 * Set API code
	 * @param apiCode
	 */
	public void setApiCode(int apiCode) {
		this.apiCode = apiCode;
	}
	
	/**
	 * Get error code
	 * @return error code
	 */
	public int getErrCode() {
		return errCode;
	}
	
	/**
	 * Set error code
	 * @param errCode
	 */
	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
	
	/**
	 * Get detail
	 * @return detail
	 */
	public String getDetail() {
		return detail;
	}
	
	/**
	 * Set detail
	 * @param detail
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	/**
	 * Get app code
	 * @return app code
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
	 * Get button title
	 * @return button title
	 */
	public String getButtonTitle() {
		return buttonTitle;
	}
	
	/**
	 * Set button title
	 * @param buttonTitle
	 */
	public void setButtonTitle(String buttonTitle) {
		this.buttonTitle = buttonTitle;
	}
}
