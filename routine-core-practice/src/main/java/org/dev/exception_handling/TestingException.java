package org.dev.exception_handling;

class A{
	public void process(){
		System.out.println("Processing A class method");
	}
}
class B extends A{
	@Override
	public void process() throws RuntimeException{
		super.process();
	}
}
public class TestingException {
	
	public static void test(){
		try{
			String str=null;
			System.out.println(str.toString()+" : ");
		}finally{
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
/*		try{
			test();
		}catch (Exception e) {
			System.out.println("exception");
		}*/
		new B().process();

	}
}
