package org.dev.thread;

class MyThread extends Thread{
	
	String name;
	
	public MyThread(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		
//		if(this.getName().equals("Devdyuti")){
//			throw new RuntimeException("Thread T2 terminates");
//		}
		
		for (int i = 0; i < 10; i++) {			
			System.out.println("Executing thread "+name);
		}
		try {
			System.out.println("\n");
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class SomeMoreTests {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread("T1");
		MyThread t2=new MyThread("T2");
//		t2.setName("Devdyuti");
		MyThread t3=new MyThread("T3");
		MyThread t4=new MyThread("T4");
		MyThread t5=new MyThread("T5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
