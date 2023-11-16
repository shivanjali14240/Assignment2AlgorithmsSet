package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.MaxProductSubarray;

public class MaxProductSubarrayTest {
	@Test
	public void testMaxProductExample1() {
		int[] arr = { 6, -3, -10, 0, 2 };
		int n = arr.length;
		assertEquals(180, MaxProductSubarray.maxProduct(arr, n));
	}

}
