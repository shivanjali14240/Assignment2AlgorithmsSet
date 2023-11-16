package com.bnt.AlgorithmsQuetionSet.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class UniqueSubsets {
	public static void main(String[] args) {
		int[] arr1 = { 2, 1, 2 };
		int N1 = 3;
		List<List<Integer>> result1 = allSubsets(arr1, N1);
		System.out.println(result1);

		
	}

	public static List<List<Integer>> allSubsets(int[] arr, int N) {
		Arrays.sort(arr);
		List<List<Integer>> subsets = new ArrayList<>();
		generateSubsets(arr, N, 0, new ArrayList<>(), subsets);
		return subsets;
	}

	private static void generateSubsets(int[] arr, int N, int index, List<Integer> current,
			List<List<Integer>> subsets) {
		subsets.add(new ArrayList<>(current));

		for (int i = index; i < N; i++) {
			if (i > index && arr[i] == arr[i - 1]) {
				continue;
			}
			current.add(arr[i]);
			generateSubsets(arr, N, i + 1, current, subsets);
			current.remove(current.size() - 1);
		}
	}

}
