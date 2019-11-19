package org.dev.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("A");
		set.add("Z");
		set.add("B");
		set.add("Y");
		set.add("C");
		
		System.out.println(set);
	}
}
