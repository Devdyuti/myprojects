package org.dev.collection;

import java.util.HashMap;
import java.util.Hashtable;

class Temp1{
	private int i;
	public Temp1(int i) {
		// TODO Auto-generated constructor stubi
		this.i=i;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+"";
	}
}
public class InternalStructureTest { 
	public static void main(String[] args) {
		//Hashtable ht=new Hashtable();
		HashMap ht=new HashMap();
		ht.put(new Temp1(5), "A");
		ht.put(new Temp1(6), "B");
		ht.put(new Temp1(15), "C");
		ht.put(new Temp1(23), "D");
		ht.put(new Temp1(16), "E");
		ht.put(new Temp1(6), "BB");
		
		System.out.println(ht);
	}
}
