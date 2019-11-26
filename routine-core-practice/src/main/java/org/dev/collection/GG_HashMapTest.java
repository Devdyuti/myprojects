package org.dev.collection;

import java.util.HashMap;
import java.util.Map;

class GEmp{
	int i=10;
	
	@Override
	public int hashCode() {
		return i;
	}
	@Override
	public String toString() {
		return i+"abc";
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}

public class GG_HashMapTest {
	
	
	public static void main(String[] args) {
		
		Map<GEmp, String> map=new HashMap<GEmp, String>();
		map.put(new GEmp(), "Ravi");
		map.put(new GEmp(), "Sunil");
		
		System.out.println(map);
		
	}
}
