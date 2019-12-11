package org.dev.baffle;

/** input1=4{1,2,3,4}
 * 	input3=3
 *  output={3,1,2,4}
 * */

class AltTab{
	public int[] getOrder(int input1, int input2, int[] input3) {
		
		int[] finalValue=new int[input3.length];
		
		int index=input2-1;
			
		for(int i=0;i<=index;i++) {
			if(i==0) {
				finalValue[i]=input3[index];
			}else {
				finalValue[i]=input3[i-1];
			}
		}
		for(int i=index+1;i<input3.length;i++) {
			finalValue[i]=input3[i];
		}
		
		return finalValue;
	}
}

public class GurdianHackerRankTest {
	public static void main(String[] args) {
		
		int input1=5;
		int input2=3;
		int[] input3= {1,2,3,4,5}; //{7,1,3,2,5,4,6,8,10,9}; // 5,7,1,3,2,4,6,8,10,9
		
		int[] output=new AltTab().getOrder(input1, input2, input3);
		
		for (int i : output) {
			System.out.print(i+",");
		}
	}
}
