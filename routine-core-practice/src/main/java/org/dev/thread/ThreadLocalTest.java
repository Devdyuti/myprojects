package org.dev.thread;

class PreantThread extends Thread{
	
	InheritableThreadLocal tl=new InheritableThreadLocal() {
		protected Object childValue(Object parentValue) 
		{
			return "CC";
		};
	};
	
	@Override
	public void run() {
		tl.set("PP");
		System.out.println("Parent Thread value: "+tl.get());
		ChildThread c=new ChildThread();
		c.start();
	}
}
class ChildThread extends Thread{
	
	ThreadLocal tl=new ThreadLocal();
	
	@Override
	public void run() {
		System.out.println("Child Thread Value "+tl.get());
	}
}

public class ThreadLocalTest {
	public static void main(String[] args) {
		PreantThread p=new PreantThread();
		p.start();
	}
}
