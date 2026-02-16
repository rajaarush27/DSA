package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	static List<List<Integer>> result = new ArrayList<>();

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		List<Integer> ans = new ArrayList<>();
		combination(n, k, ans, 1);
		System.out.println(result);
	}

	private static void combination(int n, int k, List<Integer> ans, int idx) {
		if (ans.size() == k) {
			result.add(new ArrayList<>(ans));
			return;
		}
		for (int i = idx; i <= n; i++) {
			ans.add(i);
			combination(n, k, ans, i + 1);
			ans.remove(ans.size() - 1);
		}
	}
}
