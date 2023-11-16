package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.GoodOrBadString;

public class GoodOrBadStringTest {
	@Test
	public void testIsGoodOrBadMixedString() {
		String str = "abcde?xyz";
		assertEquals(1, GoodOrBadString.isGoodOrBad(str));
	}
}
