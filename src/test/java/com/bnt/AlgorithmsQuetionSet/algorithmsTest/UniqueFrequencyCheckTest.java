package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.UniqueFrequencyCheck;

public class UniqueFrequencyCheckTest {
	@Test
	public void testIsFrequencyUnique() {
		int[] arr1 = { 1, 2, 2, 3, 3 };
		assertFalse(UniqueFrequencyCheck.isFrequencyUnique(5, arr1));

		 int[] arr2 = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
		assertTrue(UniqueFrequencyCheck.isFrequencyUnique(10, arr2));
	}
}
