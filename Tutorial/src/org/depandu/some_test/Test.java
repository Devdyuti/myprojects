package org.depandu.some_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test{
	
	static int x;
	
	String str="a";
	
	void a(){
		try{
			str+="b";
			b();
		}catch (Exception e) {
			str+="c";
			System.out.println("exception e1");
		}                                                       
	}
	void b()throws Exception{
		try{
			str+="d";
			c();
		}catch (Exception e) {
			System.out.println("exception e2");
			throw new Exception();
		}finally{
			str+="e";
			System.out.println("finally block 1");
		}
	}
	void c() throws Exception{
		try{
			str+="f";
			throw new Exception();
		}catch (Exception e) {
			str+="g";
			System.out.println("exception e3");
		}
	}
	
	void disply(){
		System.out.println("str: "+str);
	}
	
	public static void main(String[] args) {
//		int num=10;
//		
//		for(int i=1;i<=num;i++){
//			for(int j=1;j<i;j++){
//				System.out.print(j+" ");
//			}
//			System.out.println(" ");
//		}
//		System.out.println("\n");
//		for(int i=num;i>=0;i--){
//			for(int j=1;j<i;j++){
//				System.out.print(j+" ");
//			}
//			System.out.println(" ");
//		}
		
		Test t = new Test();
		t.a();
		t.disply();
	
	}
}
