package org.dev.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
	
	String name;
	ReentrantLock relock;
	
	public Worker(ReentrantLock relock, String name) {
		this.name=name;
		this.relock=relock;
	}

	@Override
	public void run() {
		boolean done=false;
		while(!done) {
			boolean ans=relock.tryLock(); // checks if there any lock available or not.
			
			if(ans) {
				try {
					Date d=new Date();
					SimpleDateFormat sf=new SimpleDateFormat("hh:mm:ss");
					System.out.println("task name- "+name+" outer locks accquires at "+sf.format(d)+" doing outer work");
					Thread.sleep(1500);
					
					relock.lock();// thread acquire a lock  
					
					try {
						System.out.println("task name- "+name+" inner locks accquires at "+sf.format(d)+" doing inner work");
						System.out.println("Lock hold count: "+relock.getHoldCount());
						Thread.sleep(1500);
					}catch (InterruptedException e) {
						
					}finally {
						System.out.println("task name- "+name+" releasing inner lock");
						relock.unlock();
					}
					System.out.println("Lock hold count: "+relock.getHoldCount());
					System.out.println("task name- "+name+" work done");
					done=true;
						
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					System.out.println("task name- "+name+" releasing outer lock");
					relock.unlock();
					System.out.println("Lock hold count: "+relock.getHoldCount());
				}
			}else {
				System.out.println("task name- "+name+" waiting for lock");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
}
public class ReentrantTest {
	public static void main(String[] args) {
		ReentrantLock rel=new ReentrantLock();
		ExecutorService pool=Executors.newFixedThreadPool(2);
		Runnable w1 = new Worker(rel, "Job1"); 
	    Runnable w2 = new Worker(rel, "Job2"); 
	    Runnable w3 = new Worker(rel, "Job3"); 
	    Runnable w4 = new Worker(rel, "Job4"); 
	    
	    pool.execute(w1);
	    pool.execute(w2);
	    pool.execute(w3);
	    pool.execute(w4);
	    
	    pool.shutdown();
	}
}
