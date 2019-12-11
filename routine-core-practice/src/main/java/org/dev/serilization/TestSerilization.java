package org.dev.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent {
	int age=34;
	String name="Devdyuti";

	
}
class Child extends Parent implements Serializable{

	String child_name="Child class";
	int rollno=36;
	
}
class Devdyuti implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String name="ABC";
	String address;
	static int age=60;
}

public class TestSerilization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
/*		Child obj=new Child();
		obj.age=888;
		obj.rollno=999;
		//Serilization 
		FileOutputStream fos=new FileOutputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println("Serilization Completed");*/
		//Deserilization
/*		FileInputStream fis=new FileInputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child c=(Child)ois.readObject();
		
		System.out.println(c.age+" "+c.rollno+" "+c.child_name);*/
		
		Devdyuti obj=new Devdyuti();
		//obj.name="Devdyuti";
//		obj.address="Anand Nagar piprahia road Arrah";
////		obj.age=35;
////		
////		System.out.println(obj.age+" "+Devdyuti.age);
////		
////		FileOutputStream fos=new FileOutputStream("C:/Users/Dev/Desktop/temp/Devdyuti.ser");
////		ObjectOutputStream oos=new ObjectOutputStream(fos);
////		oos.writeObject(obj);
////		System.out.println("Serilization Completed");
		
		FileInputStream fis=new FileInputStream("C:/Users/Dev/Desktop/temp/Devdyuti.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Devdyuti c=(Devdyuti)ois.readObject();
		
		System.out.println("Name: "+c.name+" Address: "+c.address+" Age: "+c.age);
//		
//		String password="upbal@IDSP2004";
//		System.out.println(password.substring(password.length()-4, password.length())+""+password.substring(0, password.length()-4) );
		
		
	}
}
