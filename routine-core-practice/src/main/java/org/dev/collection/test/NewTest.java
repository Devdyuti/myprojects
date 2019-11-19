package org.dev.collection.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;

/*Sorting a HashMap by value*/
public class NewTest {
	public static void main(String[] args) {
		HashMap	m=new HashMap();
	
		m.put("A", "AAA");
		m.put("B", "aaa");
		m.put("C", "ccc");
		m.put("D", "xxx");
		m.put("E", "bbb");
		
		System.out.println("Before: "+m);
		
		List<Entry> list=new LinkedList<Entry>(m.entrySet());
		
		Collections.sort(list, new Comparator<Entry>() {
			public int compare(Entry e1, Entry e2) {
				String s1=(String) e1.getValue();
				String s2=(String) e2.getValue();
				return s1.compareTo(s2);
				
			}
		});
		
		Map sortedMap=new LinkedHashMap();
		for (Entry entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(sortedMap);
		
	}

}

