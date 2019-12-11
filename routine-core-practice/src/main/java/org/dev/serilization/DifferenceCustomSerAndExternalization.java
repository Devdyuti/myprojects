package org.dev.serilization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Accounts implements Serializable{
	
	public String uname;
	public String password;
	public transient String address="Default Address";
	
	private void writeObject(ObjectOutputStream oos)throws Exception{
		System.out.println("Call writeObject()");
		oos.defaultWriteObject();
		//oos.writeObject(uname);
		//oos.writeObject(password);
		//address="Address Encrepted";
		//oos.writeObject(address);
	}
	private void readObject(ObjectInputStream ois)throws Exception{
		System.out.println("Call readObject()");
		ois.defaultReadObject();
//		uname=(String)ois.readObject();
//		password=(String)ois.readObject();
//		String enc_address=(String)ois.readObject();
//		address=enc_address+"Now it decrpted";
		
	}
	
	
	
}
class Person implements Externalizable{
	
	public String uname;
	public String password;
	public transient String address="Default Address";
	
	public Person() {
		System.out.println("Default Constructor of Person");
	}



	@Override
	public void readExternal(ObjectInput arg0) throws IOException,
			ClassNotFoundException {
		uname=(String)arg0.readObject();
		password=(String)arg0.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		arg0.writeObject(uname);
		arg0.writeObject(password);
	}
	
}
public class DifferenceCustomSerAndExternalization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Accounts a=new Accounts();
//		a.uname="Devdyuti";
//		a.password="123@gmail.com";
//		a.address="Address changed";
		
//		Person p=new Person();
//		p.uname="Devdyuti";
//		p.password="Dev@123";
//		p.address="Address Changed";
//		//Perform serilization 
//		FileOutputStream fos=new FileOutputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/DifferenceCusandExt.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(p);
//		System.out.println("Serilization Completes");
		
		//Deserlizaing code
		FileInputStream fis=new FileInputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/DifferenceCusandExt.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person a1=(Person)ois.readObject();
		
		System.out.println("NAME: "+a1.uname+" PASS: "+a1.password+" ADD: "+a1.address);
		
	}

}
