package com.cb.dp;

import java.util.Arrays;

public class LeetCode746 {

	public static void main(String[] args) {
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int[] dp = new int[cost.length];
		Arrays.fill(dp, -1);
		int zero = minCost(cost, 0, dp);
		int one = minCost(cost, 1, dp);
		System.out.println(Math.min(zero, one));
	}

	private static int minCost(int[] cost, int i, int[] dp) {
		if (i >= cost.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int f1 = minCost(cost, i + 1, dp);
		int f2 = minCost(cost, i + 2, dp);
		return dp[i] = Math.min(f1, f2) + cost[i];
	}
}
