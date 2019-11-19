package org.dev.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.print.attribute.standard.Compression;


class Person {
private String name;
public Person(String name) { this.name = name; }
public boolean equals(Person p) {
return p.name.equals(this.name);
}
}

public class CustomHashMap{
	
	public static Iterator reverse(List list){
		Collections.reverse(list);
		return list.iterator();
	}
				
	public static void main(String[] args){
		List list=new ArrayList();
		list.add(1);list.add(2);list.add(3);
		for (Object o : list) {
			System.out.print(o+",");
		}
	}

}
