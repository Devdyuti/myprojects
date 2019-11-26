package org.dev.baffle;


/*Immutable class Test*/
final class Test{

	private final int age;
	private final String name;
	private final int phone;
	
	private Test(int age, String name, int phone) {
		this.age = age;
		this.name = name;
		this.phone = phone;
		System.out.println("Name: "+name+" Age: "+age+" phone: "+phone);
	}
	public static Test createInstance(int age, String name, int phone){
		return new Test(age, name, phone);
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getPhone() {
		return phone;
	}
	
}
/*@Singleton class Student*/
class Student{
	private int i=10;
	private static Student instance;
	int count;
	private Student(){
		count++;
		System.out.println("Student intialized "+count);
	}
	//Accesser function - factory method
	public static Student getInstance(){
		if(instance==null){
			instance=new Student();/*Lazy initialization */
			return instance;
		}else{
			return instance;
		}
	}
	//Protected method 
	protected void show(){
		System.out.println("Protected method call");
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student ss=Student.getInstance();
		return ss;
	}
}

public class InterviewTest{
	
	
	public static void main(String[] args) throws CloneNotSupportedException{

	}	
}
