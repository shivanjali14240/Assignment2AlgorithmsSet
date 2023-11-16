package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.FibonacciseriesUptoNthTerm;

public class FibonacciseriesUptoNthTermTest {
	@Test
    public void testSeries() {
        int N = 10;
        int[] expected = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
        assertArrayEquals(expected, FibonacciseriesUptoNthTerm.series(N));
    }
}
