package org.dev.serilization.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Parent{
	int i=10;
}
class Child extends Parent implements Serializable{
	int j=20;
}

public class TestMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Child c=new Child();
//		c.i=888;
//		c.j=999;
		
		File f=new File("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/testt.ser");
		
		//Serilization 
//		FileOutputStream fos=new FileOutputStream(f);
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(c);
//		System.out.println("Serilization Completed");
		
		
		//Deserilization
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child c2=(Child)ois.readObject();
		
		System.out.println(c2.i+" "+c2.j);
	}
}
