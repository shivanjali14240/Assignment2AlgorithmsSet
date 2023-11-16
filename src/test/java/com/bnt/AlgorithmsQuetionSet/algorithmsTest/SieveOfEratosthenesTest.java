package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.SieveOfEratosthenes;

public class SieveOfEratosthenesTest {
	@Test
	public void testSieveOfEratosthenes() {
		List<Integer> expectedPrimes1 = Arrays.asList(2, 3, 5, 7);
		assertEquals(expectedPrimes1, SieveOfEratosthenes.sieveOfEratosthenes(10));
	}
}
