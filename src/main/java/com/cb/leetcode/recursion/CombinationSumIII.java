package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
	public static void main(String[] args) {

	}

	private static void combination(int k, int n, List<Integer> ans, List<List<Integer>> result, int idx, int target) {
		if (ans.size() == k) {
			result.add(new ArrayList<>(ans));
			return;
		}

		for (int i = idx; i < n; i++) {
		    ans.add(i);	
		}
	}
}
