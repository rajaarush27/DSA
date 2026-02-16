package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<Integer> ans = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		combination(candidates, ans, target, 0, result);
		System.out.println(result);
	}

	private static void combination(int[] candidates, List<Integer> ans, int target, int idx,
			List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(ans));
			return;
		}
		for (int i = idx; i < candidates.length; i++) {
			if (target >= candidates[i]) {
				ans.add(candidates[i]);
				combination(candidates, ans, target - candidates[i], i, result);
				ans.remove(ans.size() - 1);
			}
		}
	}

}
