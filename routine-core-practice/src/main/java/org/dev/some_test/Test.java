package org.dev.some_test;


class MyClass{
	public MyInterface m2() {
		return new MyInterface() {
			
			@Override
			public String m1() {
				// TODO Auto-generated method stub
				return "HeLLO";
			}
		};
		
	}
}
public class Test {

	public static void main(String[] args) {
		MyClass my=new MyClass();
		System.out.println(my.m2().m1());;
	}
	
}
