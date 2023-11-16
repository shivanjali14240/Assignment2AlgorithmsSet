package com.bnt.AlgorithmsQuetionSet.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class UniqueFrequencyCheck {
	public static boolean isFrequencyUnique(int N, int[] arr) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		Set<Integer> uniqueFrequencies = new HashSet<>();

		for (int frequency : frequencyMap.values()) {
			if (!uniqueFrequencies.add(frequency)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int N1 = 5;
		int[] arr1 = { 1, 2, 2, 3, 3 };
		System.out.println(isFrequencyUnique(N1, arr1));

		int N2 = 10;
		int[] arr2 = { 2, 2, 5, 10, 1, 2, 10, 5, 10, 2 };
		System.out.println(isFrequencyUnique(N2, arr2));
		;
	}
}
