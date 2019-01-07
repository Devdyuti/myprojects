package org.core.tutorial.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MessageTester {
	
	String message = "Hello World";
	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessgae());
	}
	
}
