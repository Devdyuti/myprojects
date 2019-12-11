package org.dev.baffle;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			if(i==5) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("child "+i);
			
		}
	}
}
public class HackerRank {
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		
		t.join();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main "+i);
		}
	}
}
