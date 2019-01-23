package org.divye.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


class MyCompare implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
	
}
public class ComprableTest {
	
	public static void main(String[] args) {
		SortedSet ts=new TreeSet(new MyCompare());
		ts.add(new StringBuffer("B"));
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("Bb"));
		ts.add("Dev");
		
		System.out.println(ts);
	}
	
	
}
