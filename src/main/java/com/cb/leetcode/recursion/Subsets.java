package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = new ArrayList<>();
		subsets(nums, new ArrayList<>(), result, 0);
		System.out.println(result);
	}

	private static void subsets(int[] nums, List<Integer> ans, List<List<Integer>> result, int idx) {
		result.add(new ArrayList<>(ans));
		for (int i = idx; i < nums.length; i++) {
			ans.add(nums[i]);
			subsets(nums, ans, result, i + 1);
			ans.remove(ans.size() - 1);
		}
	}
}
