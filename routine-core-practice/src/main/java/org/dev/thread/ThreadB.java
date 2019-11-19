package org.dev.thread;

class ThreadA extends Thread{
	public int total=0;
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("2. Child Thread Starts Executing..");
			for(int i=0;i<10;i++){
				total+=i;
			}
			System.out.println("3. Child Thread trying to give notification");
			this.notify();
		}
	}
}
public class ThreadB {

	public static void main(String[] args) throws InterruptedException {
		ThreadA a=new ThreadA();
		a.start();
		synchronized (a) {
			System.out.println("1. Main Thread trying to call wait method");
			a.wait();
			System.out.println("4. Main Thread get Notification");
			System.out.println("5. TOTAL: "+a.total);
		}
	}

}
