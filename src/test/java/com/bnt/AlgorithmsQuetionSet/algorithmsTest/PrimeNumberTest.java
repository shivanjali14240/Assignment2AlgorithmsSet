package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.PrimeNumber;

public class PrimeNumberTest {
	@Test
    public void testIsPrimePositive() {
        assertEquals(1, PrimeNumber.isPrime(2));
        assertEquals(1, PrimeNumber.isPrime(7));
        assertEquals(1, PrimeNumber.isPrime(17));
    }
}
