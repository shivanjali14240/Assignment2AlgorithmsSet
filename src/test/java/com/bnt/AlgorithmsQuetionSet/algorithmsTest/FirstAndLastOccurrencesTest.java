package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.FirstAndLastOccurrences;

public class FirstAndLastOccurrencesTest {
	 @Test
	    public void testFirstAndLastExample1() {
	        int[] arr = { 1, 3, 3, 4 };
	        int N = arr.length;
	        int X = 3;
	        List<Integer> expected = Arrays.asList(1, 2);
	        assertEquals(expected, FirstAndLastOccurrences.firstAndLast(arr, N, X));
	    }
}
