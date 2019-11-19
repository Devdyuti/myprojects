package org.dev.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestMyColl {
	
	public final static int THREAD_POOL_SIZE=5;
	
	public static Map hashtable=null;
	public static Map synchronizedMap=null;
	public static Map concurrentMap=null;
	public static Map hashMap=null;
	
	public static void main(String[] args) throws InterruptedException {
		
		//Test with hashtable instance
		hashtable=new Hashtable();
		MapPerformanceTest.performanceTest(hashtable, THREAD_POOL_SIZE);
		
		//Test with hashMap
/*		hashMap=new HashMap();
		MapPerformanceTest.performanceTest(hashMap, THREAD_POOL_SIZE);*/
		
		//Test with synchronizedMap
		synchronizedMap=Collections.synchronizedMap(new HashMap());
		MapPerformanceTest.performanceTest(synchronizedMap, THREAD_POOL_SIZE);
		
		//Test with concurrentMap
		concurrentMap=new ConcurrentHashMap();
		MapPerformanceTest.performanceTest(concurrentMap, THREAD_POOL_SIZE);
		
	}
}
