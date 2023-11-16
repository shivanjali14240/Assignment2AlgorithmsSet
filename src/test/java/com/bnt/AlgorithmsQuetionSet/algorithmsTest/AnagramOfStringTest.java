package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.AnagramOfString;

public class AnagramOfStringTest {

	@Test
	public void testRemAnagramEqualStrings() {
		assertEquals(0, AnagramOfString.remAnagram("abc", "abc"));
	}
}
