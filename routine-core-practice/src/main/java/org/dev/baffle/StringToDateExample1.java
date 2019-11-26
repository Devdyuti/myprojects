package org.dev.baffle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample1 {
	public static void main(String[] args) throws ParseException {
	    String sDate1="19-01-1986";  
	    Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);
	}
}
