package com.in28min.model;

import lombok.Data;
import lombok.ToString;

@Data
public class HelloBean {
	
	
	private String message;

	public HelloBean(String message) {
		this.message=message;
	}

	/*
	 * public static String getMessage(String message2) { // TODO Auto-generated
	 * method stub return message2; }
	 */

	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}
	
	

	
	

}
