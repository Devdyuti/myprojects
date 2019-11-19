package org.dev.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapToList {
	public static void main(String[] args) {
		
		HashMap<String, String> mp=new HashMap<String, String>();
		mp.put(null, "Dev");
		mp.put(null, "Dyuti");
		mp.put("A", "Singh");
		
		Set<Entry<String, String>> set=mp.entrySet();
		Iterator itr=set.iterator();
	
	}
}
