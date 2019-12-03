package org.dev.design_pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class BreakSingletonTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Singleton instance1=Singleton.getInstance();
//		Singleton instance2=Singleton.getInstance();

// first Appraach		
//		try {
//			Constructor[] constructors=Singleton.class.getDeclaredConstructors();
//			
//			for(Constructor constructor: constructors) {
//				constructor.setAccessible(true);
//				instance2=(Singleton)constructor.newInstance();
//			}
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Instance1 "+instance1.hashCode());
//		System.out.println("Instance2 "+instance2.hashCode());
		
		// second approach
		
//		FileOutputStream fos=new FileOutputStream("C:/Users/dsingh/Desktop/temp/singleton.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(instance1);
//		
//		System.out.println("Singleton class Serilized");
		
		FileInputStream fis=new FileInputStream("C:/Users/dsingh/Desktop/temp/singleton.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Singleton instance2=(Singleton) ois.readObject();
		
		System.out.println("Instance1 "+instance1.hashCode());
		System.out.println("Instance2 "+instance2.hashCode());
		
	}
}
