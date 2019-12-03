package org.dev.baffle;

import java.util.HashMap;
import java.util.Map;

class IntDecode{
	
	public static Map<Integer, Character> map=new HashMap<Integer, Character>();
	
	static {
		for(int i=65;i<=90;i++) {
			map.put(i-64, (char)i);
		}
	}
	
	public static int getPossibleDecodeVal(int input) {
		char[] ch=String.valueOf(input).toCharArray();
		for(int i=0;i<ch.length;i++) {
		}
		return 0;
	}
	
}
public class HackerRank {
	public static void main(String[] args) {
		
		IntDecode.getPossibleDecodeVal(123);
		
	//	System.out.println(IntDecode.map);
		
		
	}
}
