package org.divye.design_pattern;


public class Singleton {
	
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
}
