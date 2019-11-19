package org.dev.thread;


class Display{
	public synchronized void displayN(){
		for(int i=0;i<10;i++){
			System.out.print(i);
			try{
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	public synchronized void displayC(){
		for(int i=65;i<75;i++){
			System.out.print((char)i);
			try{
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
class MyThread1 extends Thread{
	Display d;
	public MyThread1(Display d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.displayN();
	}
}
class MyThread2 extends Thread{
	Display d;
	public MyThread2(Display d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.displayC();
	}
}
public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		Display d=new Display();
		MyThread1 t1=new MyThread1(d);
		MyThread2 t2=new MyThread2(d);
		
		t1.start();
		t2.start();
	}
}
