package com.bnt.AlgorithmsQuetionSet.algorithms;

import org.springframework.stereotype.Component;

@Component
public class SubsequenceCheck {
	public static boolean isSubSequence(String A, String B) {
		int m = A.length();
		int n = B.length();

		int i = 0, j = 0;

		while (i < m && j < n) {
			if (A.charAt(i) == B.charAt(j)) {
				i++;
			}
			j++;
		}

		return i == m;
	}

	public static void main(String[] args) {
		String string_A = "abc";
		String string_B = "ahbgdc";
		boolean result = isSubSequence(string_A, string_B);
		System.out.println(result);
	}
}
