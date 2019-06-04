package org.core.tutorial.reflection;

import java.lang.reflect.Method;

class Employee{
	
	private String name;
	private String address;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class MyReflectionTuto {
	
	public static void main(String[] args) {
		Class objectClass=Employee.class;
		
		Method[] methods=Employee.class.getMethods();
		
		for (Method method : methods) {
			System.out.println("proint: "+method.getName());
		}
	}
	
}
