package org.dev.oops;

/*@Deep Cloning Test cases 
 * This is the different of Shallow cloning, In this case a separate object is created of referenced class
 * */
class Cat{
	public String name;
	public Cat(String name) {
		this.name=name;
	}
}
class Dog implements Cloneable{
	public int i;
	Cat c;
	public Dog(Cat c, int i) {
		this.c=c;
		this.i=i;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Cat c1=new Cat("Lucie");
		Dog d=new Dog(c1, i);
		return d;
	}
}
public class DeepCloningTest{

	public static void main(String[] args) throws CloneNotSupportedException{
		Cat c=new Cat("Devdyuti");
		Dog d=new Dog(c, 10);
		
		System.out.println("BEFORE ANY CHANGES: "+d.i+" : "+d.c.name);// output-{10 : Devdyuti}
		
		// Creating a clone copy 
		Dog clone=(Dog)d.clone();
		// Perform changes on clone copy
		System.out.println(clone.i+": "+clone.c.name);
		clone.i=888;
		clone.c.name="xxxxxxxxxxxxxxxx";
		System.out.println("CHANGES ON CLONE COPY: "+clone.i+" : "+clone.c.name); // output-{888 : xxxxxxxxxxxxxxx}
		System.out.println("SEE CHANGES AFFECT ON ORIGINAL COPY: "+d.i+" : "+d.c.name);// output-{10 : Devdyuti}
		/*This is the example of Deep cloning*/
	}
}
