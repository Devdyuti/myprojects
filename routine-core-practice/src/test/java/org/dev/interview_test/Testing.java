package org.dev.interview_test;

import static org.junit.Assert.assertEquals;

import org.dev.baffle.Calculation;
import org.junit.Test;

public class Testing {
	@Test
	public void test() {
		 assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
	}
}
