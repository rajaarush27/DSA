package com.cb.dp;

import java.util.Arrays;

public class LeetCode115 {

	public static void main(String[] args) {
		String s = "rabbbit", t = "rabbit";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(distinctSubsequence(s, t, 0, 0, dp));
	}

	private static int distinctSubsequence(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0;
		int exc = 0;

		if (s.charAt(i) == t.charAt(j)) {
			inc = distinctSubsequence(s, t, i + 1, j + 1, dp);
		}
		exc = distinctSubsequence(s, t, i + 1, j, dp);
		return dp[i][j] = inc + exc;

	}
}
