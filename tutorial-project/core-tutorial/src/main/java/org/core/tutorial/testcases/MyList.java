package org.core.tutorial.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList {
	
	private List fruits=new ArrayList();
	
	public void add(String fruit) {
		fruits.add(fruit);
	}
	public void remove(String fruit) {
		if(!fruits.contains(fruit)) {
			throw new NoSuchElementException();
		}
		fruits.remove(fruit);
	}
	public int size() {
		return fruits.size();
	}
	public void removeAll() {
		fruits.clear();
	}
}
