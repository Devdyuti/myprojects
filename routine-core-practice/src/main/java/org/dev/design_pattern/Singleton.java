package org.dev.design_pattern;


public class Singleton{
	
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
	
//	public static void main(String[] args) throws CloneNotSupportedException {
//		Singleton instance1=Singleton.getInstance();
//		Singleton instance2=(Singleton) instance1.clone();
//		
//		System.out.println(instance1==instance2);
//	}
}
