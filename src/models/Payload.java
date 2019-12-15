package models;

import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Payload {
	private HashMap<String, String> set_attributes;

	/**
	 * Get set attributes
	 * @return set attributes
	 */
	public HashMap<String, String> getSet_attributes() {
		return set_attributes;
	}

	/**
	 * Set set attributes
	 * @param set_attributes
	 */
	public void setSet_attributes(HashMap<String, String> set_attributes) {
		this.set_attributes = set_attributes;
	}

	/**
	 * Constructor with 1 parameter
	 * @param set_attributes
	 */
	public Payload(HashMap<String, String> set_attributes) {
		this.set_attributes = set_attributes;
	}

	public String build(){
		ObjectMapper Obj = new ObjectMapper();
		try {
			return Obj.writeValueAsString(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
