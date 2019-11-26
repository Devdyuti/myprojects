package org.dev.baffle;

class PossibleDecode{
	
	static int[] ar=new int[26];

	static {
		for(int i=0;i<ar.length;i++) {
			ar[i]=65+i;
		}
	}
	
	public int getPossibleDecodeValue(int encodeInput) {
		return 0;
	}
	
}
class Base{
	public void m1(){
		System.out.println("calling Base m1");
	}
    public  int foo(int a) { return 10; } 
    public  char foo(int a, int b) { return 'a'; } 
    
    public final void show() {}
    
    
    public Object m2() {
    	return 10;
    }
}
class Derived extends Base{
	public void m1(){
		System.out.println("calling Derived m1");
	}
	public void show(String s) {
		// TODO Auto-generated method stub

	}
	
	@Override
    public String m2() {
    	return "dd";
    }
	
}

class Testing{
}
public class OppsTest{
	
	
	static int temp;
	
	public static int getValue(int input1, int[] input2) {
		for(int i=0;i<input2.length;i++) {
			for(int j=i+1;j<input2.length;j++) {
				if(input2[i]>input2[j]) {
					temp=input2[i];
					input2[i]=input2[j];
					input2[j]=temp;
				}
			}
		}
		return input2[input2.length-2];
	}
	
	public static void main(String[] args) {
		int input1=3;
		int[] input2= {2,2,3};
		
		System.out.println(getValue(input1, input2));
		//int i=65;
		
		for(int i=0;i<PossibleDecode.ar.length;i++) {
			System.out.println((char)PossibleDecode.ar[i]);
		}
		
		System.out.println(115%16);
		

		
	}
	
}
