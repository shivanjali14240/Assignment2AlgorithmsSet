package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.FactorialNumber;

public class FactorialNumberTest {
	@Test
	public void testFactorialNumber() {
		assertEquals(720, FactorialNumber.factorial(6));
	}

}
