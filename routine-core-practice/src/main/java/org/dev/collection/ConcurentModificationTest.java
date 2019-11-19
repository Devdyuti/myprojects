package org.dev.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**Checking for Fail-fast & Fail-safe.  
 * @if trying to modify Collection while iterating throws RE:ConcurrentModificationException
 * @ in java there is a concurrent package for Concurrency control and provides Fail-safe Iteration  
 * */
public class ConcurentModificationTest {
	
	public static void main(String[] args) {
		ConcurrentHashMap m=new ConcurrentHashMap();
		m.put(1, "Durga");
		m.put(2, "Sita");
		m.put(3, "Krishna");
		System.out.println(m);
		Set set=m.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry map=(Map.Entry)itr.next();
			Integer i=(Integer) map.getKey();
			System.out.println(i+" : "+map.getValue());
			if(i==3){
				m.put(4, "Ganesh");
			}
			
		}
		System.out.println(m);
	}

}
