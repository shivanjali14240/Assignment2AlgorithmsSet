package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.UniqueSubsets;

public class UniqueSubsetsTest {
	@Test
	public void testAllSubsets() {
		int[] arr1 = { 2, 1, 2 };
		int N1 = 3;
		List<List<Integer>> result1 = UniqueSubsets.allSubsets(arr1, N1);
		assertEquals(6, result1.size());
	}
}
