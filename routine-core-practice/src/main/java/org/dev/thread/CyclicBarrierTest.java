package org.dev.thread;

class Computation1 implements Runnable{
	
	public static int product=0;

	@Override
	public void run() {
		product=2*3;
		
	}
	
}
class Computation2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class CyclicBarrierTest {
	
}
