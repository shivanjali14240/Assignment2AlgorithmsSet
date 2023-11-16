package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.KthSmallestElement;

public class KthSmallestElementTest {
	@Test
	public void testKthSmallestExample1() {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int N = arr.length;
		int K = 3;
		assertEquals(7, KthSmallestElement.kthSmallest(arr, 0, N - 1, K));
	}
}
