package org.dev.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class WorkerThread implements Runnable{
	
	private String message;
	public WorkerThread(String message) {
		this.message=message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" (Start) message= "+message);
		try{
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" (Ends)");
		
	}
	
}

public class ThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);//creating a pool of 5 Threads
		for(int i=0;i<10;i++){
			Runnable worker=new WorkerThread(""+i);
			executor.execute(worker);// calling execute method on Executor service
		}
		executor.shutdown();
		if(!executor.isTerminated()){
			System.out.println("Finished All Threads");
		}
	}

}
