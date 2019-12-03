package org.dev.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent {
	int i=10;
}
class Child extends Parent implements Serializable{

	int j=20;
}
class Devdyuti implements Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	String name;
	String address;
	//static int age=60;
	
	transient int i=10;
	
}

public class TestSerilization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Child obj=new Child();
		//Serilization 
//		obj.i=888;
//		obj.j=999;

//		FileOutputStream fos=new FileOutputStream("C:/Users/dsingh/Desktop/temp/child-parent.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(obj);
//		System.out.println("Serilization Completed");
		//Deserilization
//		FileInputStream fis=new FileInputStream("C:/Users/dsingh/Desktop/temp/child-parent.ser");
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		Child c=(Child)ois.readObject();
//		
//		System.out.println(c.i+" "+c.j);
		
//		Devdyuti obj=new Devdyuti();
//		obj.name="Devdyuti";
//		obj.address="Anand Nagar piprahia road Arrah";
//		obj.i=34;
//		FileOutputStream fos=new FileOutputStream("C:/Users/dsingh/Desktop/temp/Devdyuti.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(obj);
//		System.out.println("Serilization Completed");
		
		FileInputStream fis=new FileInputStream("C:/Users/dsingh/Desktop/temp/Devdyuti.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Devdyuti c=(Devdyuti)ois.readObject();
		
		System.out.println("Name: "+c.name+" Address: "+c.address+" "+c.i);
		
		/*
		 * String password="upbal@IDSP2004";
		 * System.out.println(password.substring(password.length()-4,
		 * password.length())+""+password.substring(0, password.length()-4) );
		 */
		
		
	}
}
