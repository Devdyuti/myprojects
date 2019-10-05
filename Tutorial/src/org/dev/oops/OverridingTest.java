package org.dev.oops;

class Parent{
	private void m1() {
		System.out.println("Parent m1");
	}
}
class Child extends Parent{
	private void m1() {
		System.out.println("Child m1");
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Parent p=new Child();
		//p.m1();
	}
}
