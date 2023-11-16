package com.bnt.AlgorithmsQuetionSet.algorithmsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnt.AlgorithmsQuetionSet.algorithms.PalindromeNumbers;

public class PalindromeNumbersTest {
	 @Test
	    public void testIsPalindromePositive() {
	        assertEquals("Yes", PalindromeNumbers.isPalindrome(101));
	        assertEquals("Yes", PalindromeNumbers.isPalindrome(1221));
	        assertEquals("Yes", PalindromeNumbers.isPalindrome(12321));
	    }

}
