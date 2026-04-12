package com.cb.dp;

import java.util.Arrays;

public class LeetCode518 {

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[coins.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(coinChangeII(coins, amount, 0, dp));
	}

	public static int coinChangeII(int[] arr, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == arr.length) {
			return 0;
		}
		if (dp[i][amount] != -1) {
			return dp[i][amount];
		}
		int inc = 0;
		int exc = 0;

		if (amount >= arr[i]) {
			inc = coinChangeII(arr, amount - arr[i], i, dp);
		}
		exc = coinChangeII(arr, amount, i + 1, dp);
		return dp[i][amount] = inc + exc;
	}
}
