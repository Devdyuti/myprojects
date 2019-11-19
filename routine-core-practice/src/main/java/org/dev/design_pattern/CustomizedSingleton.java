package org.dev.design_pattern;

public class CustomizedSingleton {
	
	private static int count;
	private static CustomizedSingleton ref_instance;
	private static CustomizedSingleton ref_instance2=new CustomizedSingleton();
	
	private CustomizedSingleton(){
		System.out.println("Private constructor CustomizedSingleton "+count);	
	}
	public static CustomizedSingleton getInstance(){
		count++;
		if(count<=3){
			return ref_instance=createInstance();
		}else{
			return ref_instance2;
		}		
	}
	
	public static CustomizedSingleton createInstance(){
		CustomizedSingleton instance=new CustomizedSingleton();
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
