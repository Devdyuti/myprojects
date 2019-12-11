package org.dev.baffle;

import java.util.Scanner;

public class SteriaHackerRank {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		String[] sr=null;
		int[] ar=null;
		if(name!=null && name!="") {
			sr=name.split(" ");
		}
		if(sr!=null) {
			ar=new int[sr.length];	
		}
		for(int i=0;i<sr.length;i++) {
			ar[i]=Integer.parseInt(sr[i]);
		}
		
		for(int i=0;i<ar.length;i++) {
			int num=ar[i];
			
			for(int j=0;j<num;j++) {
				
				int snum=j+1;
				if(snum%3==0 && snum%5==0) {
					System.out.println("FizzBuzz");
				}
				else if(snum%3==0) {
					System.out.println("Fizz");
				}else if(snum%5==0) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(snum);
				}
			}
			System.out.println("\n");
			
		}
		
		
	}
}
