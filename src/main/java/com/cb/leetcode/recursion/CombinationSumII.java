package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	public static void main(String[] args) {
		int[] candidate = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		Arrays.sort(candidate);
		List<Integer> ans = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		combination(candidate, target, ans, 0, result);
		System.out.println(result);
	}

	private static void combination(int[] candidates, int target, List<Integer> ans, int idx,
			List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(ans));
			return;
		}

		for (int i = idx; i < candidates.length; i++) {
			if (target >= candidates[i]) {
				if (i > idx && candidates[i] == candidates[i - 1]) {
					continue;
				}
				ans.add(candidates[i]);
				combination(candidates, target - candidates[i], ans, i + 1, result);
				ans.remove(ans.size() - 1);
			}
		}
	}
}
