package org.dev.thread;

import java.util.concurrent.CountDownLatch;

class Workerc extends Thread{
	
	private int delay;
	private CountDownLatch latch;
	
	public Workerc(int delay, CountDownLatch latch, String name) {
		super(name);
		this.delay=delay;
		this.latch=latch;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName()+ " finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(4);
		
		Workerc first=new Workerc(1000, latch, "Workerc-1");
		Workerc second=new Workerc(2000, latch, "Workerc-2");
		Workerc third=new Workerc(3000, latch, "Workerc-3");
		Workerc fourth=new Workerc(4000, latch, "Workerc-4");
		
		first.start();
		second.start();
		third.start();
		fourth.start();
		
		latch.await();
		
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}
