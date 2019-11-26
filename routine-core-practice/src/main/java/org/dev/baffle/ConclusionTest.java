package org.dev.baffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;

class Temp{
	
	int i;
	
	@Override
	public String toString() {
		return i+"";
	}
	@Override
	public int hashCode() {
		return i;
	}
	public Temp(int i) {
		this.i=i;
	}
}
class Employee implements Comparable{
	String name;
	int salary;
	public Employee(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"_Employee";
	}
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
class MyComprator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1=arg0.toString();
		String s2=arg1.toString();
		System.out.println(s1+" xxxxxxxxx "+s2);
		return s1.compareTo(s2);
	}
	
}

public class ConclusionTest{
	public static void show(){
		
	}

	public static void main(String[] args) {
		
/*		HashMap h=new HashMap();
		h.put(new Temp(5), "A");
		h.put(new Temp(4), "B");
		h.put(new Temp(4), "DuplicateB");
		h.put(new Temp(2), "C1");
		h.put(new Temp(16), "C");
		h.put(new Temp(18), "C2");
		h.put(new Temp(17), "D");
		h.put(new Temp(6), "E");
		h.put(new Temp(7), "F");
		h.put(new Temp(11), "Z");*/
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("Dev",1000));
		list.add(new Employee("Ravi",2000));
		list.add(new Employee("Pushkar",500));
		list.add(new Employee("Dev",2000));
		list.add(new Employee("Dev",450));
		list.add(new Employee("Amit",4000));
		list.add(new Employee("Ravi",1000));
		
		Collections.sort(list);
		
		for (Employee e : list) {
			System.out.println(e.name+" : "+e.salary);
		}

		
	}
}
