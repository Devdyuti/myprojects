package org.dev.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Stack;

public class EnumerationTest {
	
	public static void main(String[] args) {
		
		Stack<String> st=new Stack<String>();
		st.push("A");
		st.push("B");
		st.push("C");
		st.push("D");
		st.push("E");

		Enumeration<String> en=st.elements();
		System.out.println("Peek method: "+st.search("Z"));
		while(en.hasMoreElements()){
			String ele=(String)en.nextElement();
			if(ele.equals("E")){
				st.remove(ele);
				st.push("F");
			}
		}
		System.out.println(st);
	}
	
}
