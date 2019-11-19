package org.dev.collection;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MapPerformanceTest {

	public static void performanceTest(final Map mp, int THREAD_POOL_SIZE) throws InterruptedException{
		System.out.println("Test started for: "+mp.getClass());
		long avgTime=0;
		for(int i=0;i<5;i++){
			long startTime=System.nanoTime();
			ExecutorService eService=Executors.newFixedThreadPool(THREAD_POOL_SIZE);
			for(int j=0;j<THREAD_POOL_SIZE;j++){
				eService.execute(new Runnable() {
					
					@Override
					public void run() {
						for(int i=0;i<500000;i++){
							Integer randomNumber=(int)Math.ceil(Math.random() * 550000);
							//Retrieve value 
							Integer value=(Integer) mp.get(randomNumber);
							//Put value
							mp.put(randomNumber, randomNumber);
						}
						
					}
				});
			}
			eService.shutdown();
			// Blocks until all tasks have completed execution after a shutdown request
			eService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
			long endTime=System.nanoTime();
			long totalTime=(endTime-startTime)/1000000L;
			avgTime +=totalTime;
			System.out.println("2500K entried added/retrieved in "+totalTime+" ms");
		}
		System.out.println("For " + mp.getClass() + " the average time is " + avgTime / 5 + " ms\n");
		
	}
	
}
