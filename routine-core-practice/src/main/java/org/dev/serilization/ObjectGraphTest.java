package org.dev.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dogg implements Serializable{
	Catt c=new Catt();
}
class Catt implements Serializable{
	Ratt r=new Ratt();
}
class Ratt implements Serializable{
	int i=10;
}

public class ObjectGraphTest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Dogg d=new Dogg();
//		//Perform serilization 
//		FileOutputStream fos=new FileOutputStream("C:/Users/Dev/Desktop/temp/objectGraph.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(d);
//		System.out.println("Serilization Completes");
		
		//Deserlization 
		FileInputStream fis=new FileInputStream("C:/Users/Dev/Desktop/temp/objectGraph.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dogg d=(Dogg)ois.readObject();
		System.out.println(d.c.r.i);

	}

}
