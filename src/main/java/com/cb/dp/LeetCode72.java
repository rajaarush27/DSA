package com.cb.dp;

import java.util.Arrays;

public class LeetCode72 {

	public static void main(String[] args) {

		String s = "FOOD";
		String t = "MONEY";

		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(minOperation(s, t, 0, 0, dp));
	}

	public static int minOperation(String s, String t, int i, int j, int[][] dp) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = minOperation(s, t, i + 1, j + 1, dp);
		} else {
			int D = minOperation(s, t, i + 1, j, dp);
			int R = minOperation(s, t, i + 1, j + 1, dp);
			int I = minOperation(s, t, i, j + 1, dp);
			ans = Math.min(I, Math.min(R, D)) + 1;
		}
		return dp[i][j] = ans;
	}
}
