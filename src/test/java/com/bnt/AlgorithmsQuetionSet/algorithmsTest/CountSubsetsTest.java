package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.CountSubsets;

public class CountSubsetsTest {
	 @Test
	    public void testCountSubsetsEmptyArray() {
	        int[] arr = {};
	        int n = 0;
	        assertEquals(0, CountSubsets.countSubsets(arr, n));
	    }

}
