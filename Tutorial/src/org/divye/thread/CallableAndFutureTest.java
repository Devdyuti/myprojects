package org.divye.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FactorialCalculator implements Callable<Integer>{
	private int number;
	public FactorialCalculator(int number) {
		this.number=number;
	}

	@Override
	public Integer call() throws Exception {
		return factorial(number);
	}
	private Integer factorial(int n) throws InterruptedException{
		Integer result=1;
		if(n!=0){
			result=result*n;
			result=result*factorial(n-1);
		}
		return result;
	}
	
}
class CallableAndFutureTest {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newSingleThreadExecutor();
		
		System.out.println("Submitted callable task to calulate factorial of 10");
		Future result10=es.submit(new FactorialCalculator(10));
		
		System.out.println("Submitted callable task to calulate factorial of 15");
		Future result15=es.submit(new FactorialCalculator(15));
		
		System.out.println("Submitted callable task to calulate factorial of 20");
		Future result20=es.submit(new FactorialCalculator(20));
		
		/////////////////////////////////////
		System.out.println("Calling get() method of Future to fetch result of factorial 10");
		Integer factorial10=(Integer)result10.get();
		System.out.println("Factorial of 10's is: "+factorial10);
		
		System.out.println("Calling get() method of Future to fetch result of factorial 15");
		Integer factorial15=(Integer)result15.get();
		System.out.println("Factorial of 15's is: "+factorial15);
		
		System.out.println("Calling get() method of Future to fetch result of factorial 20");
		Integer factorial20=(Integer)result20.get();
		System.out.println("Factorial of 20's is: "+factorial20);
		
	}
}
