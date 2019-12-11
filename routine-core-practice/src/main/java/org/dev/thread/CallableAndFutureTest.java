package org.dev.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//class FactorialCalculator implements Callable<Integer>{
//	private int number;
//	public FactorialCalculator(int number) {
//		this.number=number;
//	}
//
//	@Override
//	public Integer call() throws Exception {
//		return factorial(number);
//	}
//	private Integer factorial(int n) throws InterruptedException{
//		Integer result=1;
//		if(n!=0){
//			result=result*n;
//			result=result*factorial(n-1);
//		}
//		return result;
//	}
//	
//}

class MyCallable implements Callable{

	int num=0;
	
	public MyCallable(int num) {
		this.num=num;
	}
	
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first "+num+" numbers");
		int sum=0;
		for(int i=1;i<num;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
}

class CallableAndFutureTest {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		MyCallable[] jobs= {new MyCallable(10),
							new MyCallable(20),
							new MyCallable(30),
							new MyCallable(15),
							new MyCallable(25)
							};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for (MyCallable job : jobs) {
			Future f=service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
		
		
//		ExecutorService es=Executors.newSingleThreadExecutor();
//		
//		System.out.println("Submitted callable task to calulate factorial of 10");
//		Future result10=es.submit(new FactorialCalculator(10));
//		
//		System.out.println("Submitted callable task to calulate factorial of 15");
//		Future result15=es.submit(new FactorialCalculator(15));
//		
//		System.out.println("Submitted callable task to calulate factorial of 20");
//		Future result20=es.submit(new FactorialCalculator(20));
//		
//		/////////////////////////////////////
//		System.out.println("Calling get() method of Future to fetch result of factorial 10");
//		Integer factorial10=(Integer)result10.get();
//		System.out.println("Factorial of 10's is: "+factorial10);
//		
//		System.out.println("Calling get() method of Future to fetch result of factorial 15");
//		Integer factorial15=(Integer)result15.get();
//		System.out.println("Factorial of 15's is: "+factorial15);
//		
//		System.out.println("Calling get() method of Future to fetch result of factorial 20");
//		Integer factorial20=(Integer)result20.get();
//		System.out.println("Factorial of 20's is: "+factorial20);
		
	}
}
