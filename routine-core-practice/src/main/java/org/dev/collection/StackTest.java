package org.dev.collection;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("A");
		stack.push("x");
		stack.push("C");
		
		System.out.println("Stack: "+stack);
		
		System.out.println("Inserting new object:: "+stack.push("E"));
		
		System.out.println("Stack: After Insertion  "+stack);
		
		//System.out.println("Pop stack:: "+stack.pop());
		
		//System.out.println("Stack: After pop  "+stack);
		
		System.out.println(stack.search("ydddddddddd"));
		
	}
}
