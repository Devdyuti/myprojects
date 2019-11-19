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

public class ExternalizationDemo implements Externalizable{
	
	transient String s;
	transient int i;
	transient int j;
	
	public ExternalizationDemo(){
		System.out.println("No-Arg Constructor");
	}
	public ExternalizationDemo(String s, int i, int j){
		this.s=s;
		this.i=i;
		this.j=j;
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		s=(String)in.readObject();
		i=in.readInt();
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
/*	    ExternalizationDemo d1=new ExternalizationDemo("Devdyuti", 10, 20);
		//Serilization
		FileOutputStream fos=new FileOutputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/xyz.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);*/
		
		//Deserilization
		FileInputStream fis=new FileInputStream("E:/MAVEN-WORKSPACE/Tutorial/src/org/divye/serilization/xyz.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalizationDemo d2=(ExternalizationDemo) ois.readObject();
		
		System.out.println(d2.s+" "+d2.i+" "+d2.j);
	}

}
