package com.bnt.AlgorithmsQuetionSet.algorithms;

import org.springframework.stereotype.Component;

@Component
public class NThFibonacciNumber {

	public static void main(String[] args) {
		System.out.println(nthFibonacci(7));
	}

	public static int nthFibonacci(int n) {
		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
