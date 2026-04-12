package com.cb.dp;

import java.util.*;

public class LeetCode198 {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1 };
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
		System.out.println(robberTD(nums, 0, dp));
		System.out.println(robberTD2(nums, nums.length - 1, dp));
		System.out.println(robberBU(nums));

	}

	public static int robberBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int dontRob = dp[i - 1];
			dp[i] = Math.max(rob, dontRob);
		}
		return dp[dp.length - 1];
	}

	public static int robberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + robberTD(arr, i + 2, dp);
		int dontRob = robberTD(arr, i + 1, dp);
		return Math.max(rob, dontRob);
	}

	public static int robberTD2(int[] arr, int i, int[] dp) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + robberTD2(arr, i - 2, dp);
		int dontRob = robberTD2(arr, i - 1, dp);
		return Math.max(rob, dontRob);
	}
}
