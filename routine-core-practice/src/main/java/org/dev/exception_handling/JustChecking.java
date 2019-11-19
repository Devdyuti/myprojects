package org.dev.exception_handling;

import java.util.Stack;

class Devdyuti{
	public void m1(String s) {
		System.out.println("String "+s);
	}
	public void m1(Object s) {
		System.out.println("object "+s);
	}
}

public class JustChecking {
	public static void main(String[] args) {

		Stack<String> st=new Stack<String>();
		
		st.push("B");
		st.push("C");
		st.push("Z");
		
		System.out.println(st.search("A"));
		
	}
	
}
