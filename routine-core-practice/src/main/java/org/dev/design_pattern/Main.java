package org.dev.design_pattern;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		return 10;
	}
}

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
//		CustomizedSingleton s=CustomizedSingleton.getInstance();
//		CustomizedSingleton s1=CustomizedSingleton.getInstance();
//		CustomizedSingleton s2=CustomizedSingleton.getInstance();
//		CustomizedSingleton s3=CustomizedSingleton.getInstance();
//		CustomizedSingleton s4=CustomizedSingleton.getInstance();
//		CustomizedSingleton s3=(CustomizedSingleton)s.clone();
		
		
//		System.out.println(s3==s4);
		
		Employee e1=new Employee(1, "Dev");
		Employee e2=new Employee(1, "Dev");
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println("e1: "+e1.hashCode());
		System.out.println("e2: "+e2.hashCode());
		
		Map map=new HashMap();
		
		map.put(e1, "first employee instance");
		map.put(e2, "second employee instance");
		
		System.out.println(map);
		
		
	}

}
