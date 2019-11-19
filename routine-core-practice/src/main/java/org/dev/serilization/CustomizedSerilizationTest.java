package org.dev.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String uname;
	transient String password;
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		System.out.println("Customized WriteObject(OOS oos) call");
		oos.defaultWriteObject();// Meant for default serilization
		String encPwd=password.substring(password.length()-4, password.length())+"_"+password.substring(0, password.length()-4);
		oos.writeObject(encPwd);
	}
	private void readObject(ObjectInputStream in) throws Exception{
		System.out.println("Customized ReadObject(OIS ois) call");
		in.defaultReadObject();
		String encPwd=(String)in.readObject();
		password=encPwd.replace("_", "");
		password=password.substring(4, password.length())+""+password.substring(0, 4);
	}
}

public class CustomizedSerilizationTest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
/*		Account a=new Account();
		a.uname="Devdyuti";
		a.password="upbal@IDSP2004";
		
		//Perform serilization 
		FileOutputStream fos=new FileOutputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/CutomizedSer.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		System.out.println("Serilization Completes");*/
		
		//Deserlizaing code
		FileInputStream fis=new FileInputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/CutomizedSer.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a=(Account)ois.readObject();
		
		System.out.println("uname: "+a.uname+" password: "+a.password);
	}

}
