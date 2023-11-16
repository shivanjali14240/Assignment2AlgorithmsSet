package com.bnt.AlgorithmsQuetionSet.algorithms;

import org.springframework.stereotype.Component;

@Component
public class ImmediateSmallerElement {

	public static void main(String[] args) {
		int[] arr = { 6, 7, 2, 1, 5, 9 };
		int n = arr.length;
		immediateSmaller(arr, n);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void immediateSmaller(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				arr[i] = arr[i + 1];
			} else {
				arr[i] = -1;
			}
		}
		arr[n - 1] = -1;
		
	}

}
