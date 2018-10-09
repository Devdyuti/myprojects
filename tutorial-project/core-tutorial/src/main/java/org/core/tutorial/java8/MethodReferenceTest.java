package org.core.tutorial.java8;

import java.util.ArrayList;
import java.util.List;

/**Method Reference use by "::"
 * @static method
 * @instance method
 * @Constructors using new operator
 * */
public class MethodReferenceTest{
	
	public void sayHello(String message) {
		System.out.println("Hello: "+message);
	}

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Devdyuti");
		list.add("Suresh");
		list.add("Mohan");
		
		//list.forEach(System.out::println);
		
	}
}
