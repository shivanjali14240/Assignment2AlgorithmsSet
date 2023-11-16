package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.PalindromeString;

public class PalindromeStringTest {
	 @Test
	    public void testIsPalindromePositive() {
	        assertEquals(1, PalindromeString.isPalindrome("level"));
	        assertEquals(1, PalindromeString.isPalindrome("radar"));
	        assertEquals(1, PalindromeString.isPalindrome("noon"));
	    }
}
