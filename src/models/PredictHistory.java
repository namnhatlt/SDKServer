package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictHistory {
	@JsonProperty("status")
	private Status status;
	
	@JsonProperty("data")
	private Data data;
	
	@JsonProperty("history_id")
	private int historyId;
	
	@JsonProperty("type")
	private String type;
	
	/**
	 * Get status
	 * @return status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * Set status
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * get data
	 * @return data
	 */
	public Data getData() {
		return data;
	}

	/**
	 * Set data
	 * @param data
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * Get history Id
	 * @return history Id
	 */
	public int getHistoryId() {
		return historyId;
	}

	/**
	 * Set history Id
	 * @param historyId
	 */
	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}
}
