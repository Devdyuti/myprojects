package org.core.tutorial.java8;

public class Example {

	interface MathOperation{
		int operate(int a, int b);
	}
	public int operate(int a, int b, MathOperation operation) {
		return operation.operate(a, b);
	}
	interface GreetingService{
		void sayMessage(String message);
	}
	
	public static void main(String[] args) {
		MathOperation addition=(int a, int b)-> a+b;
		MathOperation substraction=(a, b)-> a-b;
		MathOperation multiplication=(int a, int b)-> {return a*b;};
		MathOperation division=(int a, int b)-> a/b;
		
		GreetingService gs1=(message)->
		System.out.println("Hello from service 1: "+message);
		
		GreetingService gs2=message->
		System.out.println("Hello from service 2: "+message);

		gs1.sayMessage("Devdyuti");
		gs2.sayMessage("Suresh");
		
		Example ex=new Example();
		
		System.out.println("Addition: "+ex.operate(10, 5, addition));
		System.out.println("Substraction: "+ex.operate(10, 5, substraction));
		System.out.println("Multiplication: "+ex.operate(10, 5, multiplication));
		System.out.println("Division: "+ex.operate(10, 5, division));
		
		
	}

}
