package org.dev.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {
	public static void main(String[] args) throws InterruptedException {

		ArrayBlockingQueue q=new ArrayBlockingQueue(5);
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		//q.offer("F");
	
		Iterator itr=q.iterator();
		while(itr.hasNext()){
			String s=(String)itr.next();
			if(s.equals("D")){
				q.add("F");
			}
		}
		System.out.println(q);
	}
}
