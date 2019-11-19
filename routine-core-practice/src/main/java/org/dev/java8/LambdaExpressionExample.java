package org.dev.java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Drawable{  
    public String draw(String name);  
}
@FunctionalInterface
interface Addable{
	public int add(int a, int b);
}
public class LambdaExpressionExample {
	public static void main(String[] args) {
		int width=10;
		Drawable d=(name)->{
			return "Drawing "+name;  
		};
		System.out.println(d.draw("Devdyuti"));
		
		
		Addable ad1=(a,b)->(a-b);
				System.out.println(ad1.add(20, 10));
				
		//////////////////////////////////////////
				
		        List<String> list=new ArrayList<String>();  
		        list.add("ankit");  
		        list.add("mayank");  
		        list.add("irfan");  
		        list.add("jai"); 
		        
		        list.forEach(
		        		(n)-> System.out.println(n)
		        );
		        
		//////////////////////////////////////////////////
		        
		Runnable r=()->{
			System.out.println("Thread is running");
		};
		Thread t1=new Thread(r);
		t1.start();
		
	}
}
