package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsII {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		List<List<Integer>> result = new ArrayList<>();
		subsets(arr, new ArrayList<>(), result, 0);
		System.out.println(result);
	}

	private static void subsets(int[] nums, List<Integer> ans, List<List<Integer>> result, int idx) {
		result.add(new ArrayList<>(ans));
		for (int i = idx; i < nums.length; i++) {
			if (i > idx && nums[i] == nums[i - 1]) {
				continue;
			}
			ans.add(nums[i]);
			subsets(nums, ans, result, i + 1);
			ans.remove(ans.size() - 1);
		}
	}
}
