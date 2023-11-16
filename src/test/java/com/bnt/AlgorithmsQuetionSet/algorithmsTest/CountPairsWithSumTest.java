package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.CountPairsWithSum;

public class CountPairsWithSumTest {
	 @Test
	    public void testGetPairsCountNoPairs() {
	        int[] arr = { 1, 2, 3, 4, 5 };
	        int n = arr.length;
	        int k = 10;
	        assertEquals(0, CountPairsWithSum.getPairsCount(arr, n, k));
	    }


}
