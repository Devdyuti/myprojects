package org.dev.exception_handling;

public class TestExcep {
	public static void main(String[] args){
		//doStuff();
		
		try{
			System.out.println(10/0);
		}catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
	 	
	}
	public static void doStuff() throws Exception{
		doMoreStuff();
	}
	public static void doMoreStuff() throws Exception{
		throw new Exception();
	}
}
