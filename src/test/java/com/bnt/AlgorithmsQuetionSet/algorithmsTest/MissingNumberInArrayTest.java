package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.MissingNumberInArray;

public class MissingNumberInArrayTest {
	@Test
    public void testFindMissingNumberExample1() {
        int[] arr = { 1, 2, 3, 5 };
        int N = 5;
        assertEquals(4, MissingNumberInArray.findMissingNumber(arr, N));
    }
}
