package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.SubsequenceCheck;

public class SubsequenceCheckTest {
	@Test
	public void testIsSubSequence() {
		assertTrue(SubsequenceCheck.isSubSequence("abc", "ahbgdc"));

	}
}
