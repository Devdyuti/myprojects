package org.dev.oops;

/*This is the Example of Method Hiding
 * When u override  static method of super class and there is no actually overriding 
 * Here simply child class holing static method of same method name and signature, There r no overriding performing
 * 
 * */
class Animal{
	public static String test(){
		return "Animal";
	}
}
class Rat extends Animal{
	public static String test() {
		return "Rat";
	}
}

public class MethodHiding {
	public static void main(String[] args) {
		Animal r=new Rat();
		System.out.println(r.test());
	}
}
