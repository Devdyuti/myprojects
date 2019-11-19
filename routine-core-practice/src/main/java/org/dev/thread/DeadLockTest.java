package org.dev.thread;


class A{
	public synchronized void d1(B b){
		System.out.println("Thred1 starts executing the d1() method");
		try{
			Thread.sleep(6000);
		}catch (InterruptedException e) {
		}
		System.out.println("Thread1 Trying to call last() method");
		b.last();
	}
	public synchronized void last(){
		System.out.println("last() method inside A");
	}
}
class B{
	public synchronized void d2(A a){
		System.out.println("Thread2 starts executing the d2() method");
		try{
			Thread.sleep(6000);
		}catch (InterruptedException e) {
		}
		System.out.println("Thread2 Trying to call last() method");
		a.last();
	}
	public synchronized void last(){
		System.out.println("last() method inside B");
	}
}
public class DeadLockTest extends Thread{
	
	A a = new A();
	B b = new B();
	
	public void m1(){
		this.start();
		a.d1(b);
	}
	@Override
	public void run() {
		b.d2(a);
	}
	
	public static void main(String[] args) {
		DeadLockTest dlt=new DeadLockTest(); 
		dlt.m1();
	}

}
