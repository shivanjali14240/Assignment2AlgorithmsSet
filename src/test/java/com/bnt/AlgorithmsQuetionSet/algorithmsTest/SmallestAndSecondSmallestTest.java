package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.SmallestAndSecondSmallest;

public class SmallestAndSecondSmallestTest {
	@Test
	public void testMinAnd2ndMin() {
		int[] array1 = { 5, 2, 4, 3, 5, 6 };
		int[] expected1 = { 2, 3 };
		assertArrayEquals(expected1, SmallestAndSecondSmallest.minAnd2ndMin(array1, array1.length));
	}
}
