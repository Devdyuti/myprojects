package org.depandu.some_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Customer{
	private String name;
	private String phone;
	
	public Customer(String name, String phone) {
		this.name=name;
		this.phone=phone;
	}
}

public class MyRandomTest {
	public static void main(String[] args) {
		
		List anotherList=new ArrayList();
		anotherList.add("AA");
		anotherList.add("BB");
		anotherList.add("CC");

		List list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add(null);
		list.add("A");
		list.add(new Customer("Devdyuti", "7428766617"));
		list.add(new Customer("Devjyoti", "7070709750"));
		list.addAll(anotherList);
		
		System.out.println("list: "+list);

	}
}
