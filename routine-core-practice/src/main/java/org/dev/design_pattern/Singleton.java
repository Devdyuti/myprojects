package org.dev.design_pattern;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	
	private static Singleton instance=new Singleton();
	
	private Singleton(){
		System.out.println("Default Constructor of Signleton class: ");
		
//		if(instance!=null) {
//			throw new InstantiationError("Object creation not possible");
//		}
	}
	public static Singleton getInstance(){
		if(instance==null){
			return new Singleton();
		}else{
			return instance;
		}
	}
// Serilizable breaking case	
//	protected Object readResolve() {
//		return instance;
//	}
	
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
