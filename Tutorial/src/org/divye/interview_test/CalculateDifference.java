package org.divye.interview_test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class Person{
	private String name;
}
public class CalculateDifference {
	
	
	public static Date getDifference(String path){
		try{
			File file = new File(path);
			BufferedReader br=new BufferedReader(new FileReader(file));
			String str="";
			String str1="";
			Date d1,d2;
			while((str=br.readLine())!=null){
				str1+=str;
			}
			String[] ar=str1.split(" ");
			String[] dateAr=new String[ar.length];
			for (int i = 0; i < ar.length; i++) {
				if((ar[i].length()==10) && ar[i].contains("-")){
					if(i<ar.length-2){
						//System.out.println(ar[i]+" "+ar[i+1]+" "+ar[i+2]);
						dateAr[i]=ar[i]+" "+ar[i+1]+" "+ar[i+2];
					}
					
				}
			}
			List<String> list=new ArrayList<String>();
			for (int i = 0; i < dateAr.length; i++) {
				if(dateAr[i]!=null){
					list.add(dateAr[i]);
				}
			}
			
			System.out.println(d1+" "+d2);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

	
	public static void main(String[] args) {
//		Scanner sr=new Scanner(System.in);
//		System.out.println("Enter the text");
//		String str=sr.nextLine();
//		System.out.println(str);
		
//		Person p=new Person();
//		System.out.println(p+" "+p.hashCode());
//		
//		HashMap<Object, String> hm = new HashMap<Object, String>();
//		
//		
//		hm.put(p, "Abc");
//		hm.put("A", "Bcc");
//		
//		System.out.println(hm);
//		
//		System.out.println(hm.get(p));
//		
//		Date d = new Date();
//		SimpleDateFormat dateformat=new SimpleDateFormat("DD-MM-YYYY hh:mm:ss a");
//		String date=dateformat.format(d);
//		
//		System.out.println(date);
		
		String path = "D:/Profiles/dsingh.AD-ONE/Desktop/test.text";
		
		getDifference(path);
		
//		String[] ar ={"A","B","C","D","E","F","G","H"};
//		for(int i=0;i<ar.length;i++){
//			if(i<ar.length-3){
//				System.out.println(ar[i]+" : "+ar[i+3]);	
//			}else{
//				System.out.println(ar[i]);
//			}			
//		}
	}
}
