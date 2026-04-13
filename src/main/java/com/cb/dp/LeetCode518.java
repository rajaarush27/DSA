package com.cb.dp;

import java.util.Arrays;

public class LeetCode518 {

	// BU (Bottom Up)
	// TD (Top Down)

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[coins.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(coinChangeII(coins, amount, 0, dp));
		System.out.println(coinChangeIIUsingBU(coins, amount));
	}

	public static int coinChangeIIUsingBU(int[] coins, int amount) {
		int[][] dp = new int[coins.length + 1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int am = 1; am < dp[0].length; am++) {
				int inc = 0, exc = 0;
				if (am >= coins[i - 1]) {
					inc = dp[i][am - coins[i - 1]];
				}
				exc = dp[i - 1][am];
				dp[i][am] = inc + exc;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
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
