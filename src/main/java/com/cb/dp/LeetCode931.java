package com.cb.dp;

import java.util.Arrays;

public class LeetCode931 {

	public static void main(String[] args) {

		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -666666);
		}
		int ans = Integer.MAX_VALUE;
		for (int j = 0; j < matrix[0].length; j++) {
			ans = Math.min(ans, minFallingPathSum(matrix, 0, j, dp));
		}

		System.out.println(ans);
	}

	private static int minFallingPathSum(int[][] matrix, int i, int j, int[][] dp) {
		if (j < 0 || j >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (i == matrix[0].length-1) {
			return matrix[i][j];
		}

		if (dp[i][j] != -666666) {
			return dp[i][j];
		}

		int ld = minFallingPathSum(matrix, i + 1, j - 1, dp);
		int rd = minFallingPathSum(matrix, i + 1, j + 1, dp);
		int d = minFallingPathSum(matrix, i + 1, j, dp);

		return dp[i][j] = Math.min(d, Math.min(rd, ld)) + matrix[i][j];
	}
}
