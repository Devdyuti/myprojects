package org.core.tutorial.testcases;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class MyListTest extends TestCase{
	
	private MyList myList=new MyList();
	
	@Before
	public void init() {
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Gauva");
	}
	@Test
	public void testSize() {
		assertEquals("Checking size of list",3, myList.size());
	}
	@Test
	public void testAdd() {
		myList.add("Orange");
		assertEquals("Adding 1 more fruit in list",4, myList.size());
	}
	@Test
	public void testRemove() {
		myList.remove("Apple");
		assertEquals("Removing 1 more fruit in list",2, myList.size());
	}
	@Test(expected=NoSuchElementException.class)
	public void testRemoveException() {
		myList.remove("Kiwi");
		assertEquals("Removing 1 more fruit in list",2, myList.size());		
	}
	
	@After
	public void destroy() {
		myList.removeAll();
	}
	
}
