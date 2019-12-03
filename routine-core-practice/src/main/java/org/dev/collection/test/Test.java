package org.dev.collection.test;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class MyComprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue bq=new ArrayBlockingQueue(5);
		
		bq.add("A");
		bq.add("B");
		bq.add("C");
		bq.add("D");
		bq.add("E");
		
		System.out.println(bq);
		
	}

}
