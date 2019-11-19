package org.dev.thread;

import java.util.ArrayList;
import java.util.List;

/** Pending work
 * */
class Record{
	public int num=10;
	public int get(){
		return num;
	}
	public void add(int n){
		num=n;
	}
}
class Clerk{
	public synchronized void transfer(Record a, Record b, int amount){
		synchronized (a) {
			synchronized (b) {
				a.add(amount);
				b.add(amount);
			}
		}
	}
}
public class Test{
	
	private static void doTransfer(final Record a, final Record b,final int amount){
		new Thread(){
			public void run() {
				new Clerk().transfer(a, b, amount);
			}
		}.start();
	}
	
	public static void main(String[] args) throws InterruptedException{
		Record r1=new Record();
		Record r2=new Record();
		doTransfer(r1, r2, 5);
		doTransfer(r2, r1, 2);
		doTransfer(r1, r2, 1);
		System.out.println(r1.get()+" "+r2.get());
	}

}
