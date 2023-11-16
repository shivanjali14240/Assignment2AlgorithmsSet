package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.SecondLargestElement;

public class SecondLargestElementTest {
	 @Test
	    public void testGetSecondLargest() {
	        int[] array1 = {22, 11, 44, 33, 66, 2, 12};
	        assertEquals(44, SecondLargestElement.getSecondLargest(array1, array1.length));
	 }
}
