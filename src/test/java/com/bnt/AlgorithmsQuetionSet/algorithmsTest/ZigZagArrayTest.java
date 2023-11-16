package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bnt.AlgorithmsQuetionSet.algorithms.ZigZagArray;

public class ZigZagArrayTest {

	@Autowired
	private ZigZagArray zigZagArray;

	@Test
	public void testZigZag() {
		int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
		int n = arr.length;

		zigZagArray.zigZag(arr, n);

		int[] expected = { 3, 7, 4, 8, 2, 6, 1 };
		assertArrayEquals(expected, arr);
	}
}