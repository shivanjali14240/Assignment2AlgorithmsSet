package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.ImmediateSmallerElement;

public class ImmediateSmallerElementTest {
	@Test
	public void testImmediateSmallerExample1() {
		int[] arr = { 6, 7, 2, 1, 5, 9 };
		int n = arr.length;
		int[] expected = { -1, 2, 1, -1, -1, -1 };
		ImmediateSmallerElement.immediateSmaller(arr, n);
		assertArrayEquals(expected, arr);
	}
}
