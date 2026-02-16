package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = new ArrayList<>();
		permute(nums, new ArrayList<>(), result, new boolean[nums.length]);
		System.out.println(result);
	}

	private static void permute(int[] nums, List<Integer> ans, List<List<Integer>> result, boolean[] used) {
		if (ans.size() == nums.length) {
			result.add(new ArrayList<>(ans));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			}
			used[i] = true;
			ans.add(nums[i]);
			permute(nums, ans, result, used);
			ans.remove(ans.size() - 1);
			used[i] = false;
		}
	}
}
