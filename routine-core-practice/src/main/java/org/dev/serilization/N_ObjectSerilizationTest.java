package org.dev.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Dog implements Serializable{
	String name;
}
class Cat implements Serializable{
	String name;
}
class Rat implements Serializable{
	String name;
}

public class N_ObjectSerilizationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
/*		Dog d=new Dog();d.name="Dog";
		Cat c=new Cat();c.name="Cat";
		Rat r=new Rat();r.name="Rat";
		//Perform serilization 
		FileOutputStream fos=new FileOutputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/nObject.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		System.out.println("Serilization Completes");*/
		
		FileInputStream fis=new FileInputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/nObject.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d=(Dog)ois.readObject();
		System.out.println(d.name);
		Rat r=(Rat)ois.readObject();
		System.out.println(r.name);
		Cat c=(Cat)ois.readObject();
		System.out.println(c.name);
		
		/*We can Serlize n number of objects but at the time deserlization the order must be same as the same order at time of serilization otherwise 
		 * RE: ClassCastException.
		 * */
	}
}
