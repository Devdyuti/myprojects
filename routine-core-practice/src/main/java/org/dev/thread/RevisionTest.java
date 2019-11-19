package org.dev.thread;
/*
 * @ Example DeadLock
 */
class Testing{
	private static Object resource=new Object();
	public void go(){
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("foo");
				
			}
		};
/*		new Thread(r){
			public void run() {
				System.out.println("bar");
			}
		}.start();*/
		Thread t=new Thread(r);
		t.start();
		
	}
}
public class RevisionTest {
	
	public static void main(String[] args) {
		Testing t=new Testing();
		//Thread tobj=new Thread(t);
			
	}	
}
