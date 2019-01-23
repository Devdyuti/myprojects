package org.divye.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Tempp{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "temp";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalyze calls");
	}
}
class Student{
	private int i;
	
	public Student(int i) {
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

public class IdentityWeekHashMapTest {
	public static void main(String[] args) {
//		Map hm=new IdentityHashMap();
		Map hm=new HashMap();
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode()+" : "+i2.hashCode());
		System.out.println("-----------------------"+"\n");
		
		Student s1=new Student(50);
		Student s2=new Student(50);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()+" : "+s2.hashCode());
		
//		hm.put(i1, "value1");
//		hm.put(i2, "value2");
		
		hm.put(s1, "value1");
		hm.put(s2, "value1");

		//System.out.println(hm);
		
		/*HashMap uses .equals() method to compare the key object & that's the reason here key i2 override the i1.
		 * */
		//System.out.println(hm);
		
//		Tempp t=new Tempp();
//
//		WeakHashMap hm1=new WeakHashMap();
//		hm1.put(t, "Kalynai");
//		System.out.println("Before garbage collection "+hm1);
//		
//		t=null;
//		
//		System.gc();
		
		/*Conclusion: Garbage collection Dominates the weakHashMap if the objects are no longer reference, eligible for Garbage collection.
		 * But in case of HashMap, HashMap dominates the garbage collection.
		 * */
//		System.out.println("Afer grabage collection:::"+hm1);
		
		System.out.println(hm);
		
		
	}
}
