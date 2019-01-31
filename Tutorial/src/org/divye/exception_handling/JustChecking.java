package org.divye.exception_handling;


import java.util.TreeSet;

class DevdyutiEx{
	private String titlle;
	public DevdyutiEx(String title) {
		this.titlle=title;
	}
}

public class JustChecking {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new DevdyutiEx("SINGH"));
		t.add(new DevdyutiEx("YADAV"));
		System.out.println(t);
	}	
	
}
