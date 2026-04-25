package com.cb.dp;

import java.util.Arrays;

public class ValentineMagic {
	public static void main(String[] args) {
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		int[][] dp = new int[boys.length][girls.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(valentine(boys, girls, 0, 0, dp));
	}

	public static int valentine(int[] boys, int[] girls, int i, int j, int[][] dp) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 9999999;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int sel = Math.abs(boys[i] - girls[j]) + valentine(boys, girls, i + 1, j + 1, dp);
		int rej = valentine(boys, girls, i, j + 1, dp);
		return dp[i][j] = Math.min(sel, rej);
	}
}
