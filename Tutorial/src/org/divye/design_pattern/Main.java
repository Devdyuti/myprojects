package org.divye.design_pattern;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		CustomizedSingleton s=CustomizedSingleton.getInstance();
		CustomizedSingleton s1=CustomizedSingleton.getInstance();
		CustomizedSingleton s2=CustomizedSingleton.getInstance();
		CustomizedSingleton s3=CustomizedSingleton.getInstance();
		CustomizedSingleton s4=CustomizedSingleton.getInstance();
		//CustomizedSingleton s3=(CustomizedSingleton)s.clone();
		
		
		System.out.println(s3==s4);
	}

}
