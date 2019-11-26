package org.dev.baffle;


public class Singleton extends Thread{
	
	private static Singleton instance= new Singleton();
	
	private Singleton(){
		System.out.println("Default Constructor of Signleton class: ");
	}
	public static Singleton getInstance(){
		if(instance==null){
			return new Singleton();
		}else{
			return instance;
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	@Override
	public synchronized void run() {
		System.out.println("Calling run");
	}
}
