package com.cb.dp;

import java.util.Arrays;

public class LeetCode64 {

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(minPathSum(grid, 0, 0, dp));
	}

	private static int minPathSum(int[][] grid, int i, int j, int[][] dp) {
		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return grid[i][j];
		}

		if (i >= grid.length || j >= grid[0].length) {
			return Integer.MAX_VALUE;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int v = minPathSum(grid, i + 1, j, dp);
		int h = minPathSum(grid, i, j + 1, dp);

		return dp[i][j] = Math.min(v, h) + grid[i][j];

	}
}
