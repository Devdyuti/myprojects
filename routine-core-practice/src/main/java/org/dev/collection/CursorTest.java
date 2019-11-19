package org.dev.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector; 

class A{
	public static void m1() {
		System.out.println("caliing A m1");
	}
}
class B extends A{

	public static void m1() {
		System.out.println("B's m1() called");
	}
	
}

public class CursorTest {
	public static void main(String[] args) {
		Vector vector=new Vector();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		
		List al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		
		Iterator itr=al.listIterator();
		while (itr.hasNext()) {
			if(itr.next().equals("C")) {
				itr.remove();
			}
			
		}
		//System.out.println(al);
		
		HashSet hs = new HashSet();
		
		
		HashMap hm= new HashMap();
		System.out.println(hm.put(1, "A"));
		
		System.out.println(hm.put(2, "B"));
		
		System.out.println(hm.put(2, "C"));
		
		System.out.println(hm);
		
		String str=null;
		
		System.out.println(str.equals(null));
		
		
		
		
		
	}
}
