package com.cb.leetcode.recursion.practise;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		List<List<Integer>> result = new ArrayList<>();
		int[] candidates = { 2, 3, 6, 7 };
		combination(candidates, 7, new ArrayList<>(), result, 0);
		System.out.println(result);
	}

	private static void combination(int[] candidates, int target, List<Integer> ans, List<List<Integer>> result,
			int idx) {
		if (target == 0) {
			result.add(new ArrayList<>(ans));
			return;
		}
		for (int i = idx; i < candidates.length; i++) {
			if (candidates[i] <= target) {
				ans.add(candidates[i]);
				combination(candidates, target - candidates[i], ans, result, i);
				ans.remove(ans.size() - 1);
			}
		}

	}
}
