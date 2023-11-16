package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.ThirdLargestElement;

public class ThirdLargestElementTest {
	@Test
	public void testGetThirdLargest() {
		int[] a1 = { 44, 66, 99, 77, 33, 22, 55 };
		assertEquals(66, ThirdLargestElement.getThirdLargest(a1, 7));

	}
}
