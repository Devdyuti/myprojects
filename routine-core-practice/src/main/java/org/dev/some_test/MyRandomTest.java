package org.dev.some_test;

import java.util.ArrayList;
import java.util.Arrays;
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

class TestNew{
	public void foo() {
		try {
			throw new RuntimeException();
		}finally {
			System.out.println("Finally Block");
		}
	}
}

class A{
	public void m1() {}
}
abstract class B{
	public void m2() {}
}

public class MyRandomTest extends B{
	
	int lastIndx;
	
	public int[] mergeArrays(int[]arr1,int[]arr2){
	    int len=arr1.length+arr1.length;
	  
		int[] merge= new int[len];
		for(int i=0;i<arr1.length;i++) {
			lastIndx=i;
			merge[i]=arr1[i];
		}
		System.out.println("LastIndex: "+lastIndx);
		for(int i=1;i<=arr2.length;i++) {
			merge[lastIndx+i]=arr2[i-1];
		}
		return merge;
	}
	
	public static void main(String[] args) {
		
/*		List anotherList=new ArrayList();
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
		list.addAll(anotherList);*/
		
		//System.out.println("list: "+list);
		
//		int[] arr1=new int[]{0,5,-1,2,3};
//		int[] arr2=new int[]{4,-2,-1,6,1};
//		
//		int[] ar=new MyRandomTest().mergeArrays(arr1, arr2);
//		
//		Arrays.sort(ar);
//		
//		for(int i=0;i<ar.length;i++) {
//			System.out.print(ar[i]+", ");
//		}
		try {
			new TestNew().foo();
			System.out.println("New statement:::");
		}catch (Exception e) {
			System.out.println("Catch block");
		}		

	}
}
