package org.core.tutorial.testcases;

public class MessageUtil {
	
	private String messgae;
	
	public MessageUtil(String message) {
		this.messgae=message;
	}
	public String printMessgae() {
		System.out.println("Message:: "+messgae);
		return messgae;
	}
	
}
