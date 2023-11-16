package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.AddMinCharacters;

public class AddMinCharTest {
	@Test
	public void testAddMinCharNonPalindromeString() {
		assertEquals(5, AddMinCharacters.addMinChar("shivshiv"));
	}

}
