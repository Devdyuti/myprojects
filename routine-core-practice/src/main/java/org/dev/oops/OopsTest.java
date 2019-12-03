package org.dev.oops;

import java.util.HashMap;
import java.util.Map;

public class OopsTest {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		for(int i=0; i<16;i++) {
			map.put(i, "Abc"+i);
		}
	}
}
