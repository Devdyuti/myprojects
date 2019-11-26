package org.dev.baffle;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Person{
	private String name;
}
public class CalculateDifferenceOfDates {
	
	public static String regix="^[0-3]?[0-9]-[0-3]?[0-9]-(?:[0-9]{2})?[0-9]{2}$";
	
	public static String getDatesDifference(String path){
		
		try{
			File file = new File(path);
			BufferedReader br=new BufferedReader(new FileReader(file));
			String str="";
			String textstr="";
			List<String> listDate=new ArrayList<String>();
			Pattern pattern=Pattern.compile(regix);
			while((str=br.readLine())!=null){
				textstr+=str;				
			}
			String[] textAr=textstr.split(" ");
			
			for (String dateStr : textAr) {
				Matcher matcher=pattern.matcher(dateStr);
				if(matcher.matches()){
					listDate.add(dateStr);
				}
			}
			Date[] date=new Date[listDate.size()];
			for(int i=0;i<date.length;i++){
				date[i]=new SimpleDateFormat("dd-MM-yyyy").parse(listDate.get(i));
			}
			long diffInmiliSec=getDiffInMiliSec(date);
			long diffInDays=getDiffInDays(diffInmiliSec);
			return diffInDays+" Days";
						
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static long getDiffInMiliSec(Date[] date){
		long miliSecDiff=0;
		try{
			long[] milisec_data=new long[date.length];
			
			
			for(int i=0;i<date.length;i++){
				milisec_data[i]=date[i].getTime();
			}
			miliSecDiff=milisec_data[1]-milisec_data[0];
			
		}catch (Exception e) {
			System.out.println("Exception in getDifference:: "+e);
		}
		return miliSecDiff;
	}
	public static long getDiffInDays(long difference){
		try{
			long diffInSec=difference/1000;
			long diffInHr=diffInSec/3600;
			long diffInDays=diffInHr/24;
			return diffInDays;
		}catch (Exception e) {
			System.out.println("Exception in getDiffInDays: "+e);
		}
		return 0;
	}
	

	
	public static void main(String[] args) {
		
		String path = "D:/Profiles/dsingh.AD-ONE/Desktop/test.text";
		
		System.out.println(getDatesDifference(path));
		
	}
}
