package org.dev.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* Checking for Instance control Flow 
 * case-2 if Child is serilizable but Parent is not serilizable 
 * Serilization performs, JVM first check for any instance var coming from non-serlized parent or not if yes! JVM ignore its original value and keep the default value
 * But at the time of De-serilization JVM fist check is there any non-serilized parent, if yes JVM call instance control flow. Which create new separate object of parent 
 * class and get the value from there 
 * Important fact: At the time of deserilization Parent must have a default constructor other wise we will get RE: InvalidClassException
 * */
class Dev{
	int i=10;
}
class Aarush implements Serializable{
	int j=20;
	Dev d=new Dev();
}
public class SerilizationTestAgain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//code for Serilization
		Aarush aarush=new Aarush();
		aarush.j=888;
		aarush.d.i=999;
		
		FileOutputStream fos=new FileOutputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/CutomizedSer.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(aarush);
		System.out.println("Serilization Sucessfully!");
		
//		FileInputStream fis=new FileInputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/CutomizedSer.ser");
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		Aarush t2=(Aarush)ois.readObject();
//		System.out.println(t2.i+" : "+t2.j);
		
	}
}
