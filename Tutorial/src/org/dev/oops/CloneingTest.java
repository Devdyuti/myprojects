package org.dev.oops;

/*Cloning means make a exactly same copy of an object
 * PURPOSE OF CLONING: To maintain original copy in 
 * */

class Test{
	public String name="Devdyuti";
}

public class CloneingTest implements Cloneable{
	Test test=new Test();
	int i=10;
	public static void main(String[] args) throws CloneNotSupportedException{
		CloneingTest t=new CloneingTest();
		CloneingTest c=(CloneingTest) t.clone();
		
		// performing changing state of a clone 
		c.i=20;
		c.test.name="Ravi";
		
		//checking any changes on clone, Is reflecting on original copy or not .?
		System.out.println(t.i+" Name: "+t.test.name);
		/*In above example var i hasn't changed but var name of Test.class has changed 
		 * @This is called Shallow cloning
		 * */
		 
	}
}
