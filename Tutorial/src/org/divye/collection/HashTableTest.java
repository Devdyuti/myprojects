package org.divye.collection;

import java.util.Hashtable;

class Temp2{
	private int i;
	public Temp2(int i) {
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

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new Temp2(5), "A");
		ht.put(new Temp2(6), "B");
		ht.put(new Temp2(15), "C");
		ht.put(new Temp2(23), "D");
		ht.put(new Temp2(16), "E");
		ht.put(new Temp2(6), "BB");
		ht.put(new Integer(6), "CC");
		
		System.out.println(ht);
	}
}
