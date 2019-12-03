package org.dev.collection.test;

import java.util.HashMap;
import java.util.Map;

class Person{
	int id;
	String name;
	
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		return 10;
	}
	@Override
	public String toString() {
		return name+"@"+id;
	}
}

public class CollisionTestInMap {
	public static void main(String[] args) {
		Map<Person, String> map=new HashMap<Person, String>();
		
		Person p1=new Person(1, "Devdyuti");
		Person p2=new Person(2, "Ravi");	
		
		map.put(p1, "Dev_singh");
		map.put(p2, "Ravi_singh");
		
		System.out.println(map);
		
	}	
}
