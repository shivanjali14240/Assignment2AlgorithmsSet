package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.EquilibriumPoint;

public class EquilibriumPointTest {
	@Test
	public void testEquilibriumPointExample() {
		int[] arr = { 1, 3, 5, 2, 2 };
		int n = arr.length;
		assertEquals(3, EquilibriumPoint.equilibriumPoint(arr, n));
	}
}
