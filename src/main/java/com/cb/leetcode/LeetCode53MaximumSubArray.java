package com.cb.leetcode;

public class LeetCode53MaximumSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maximumSubArray(nums));
		System.out.println(maximumSubArrayV2(nums));
	}

	private static int maximumSubArray(int[] nums) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int currentSum = 0;
			for (int j = i; j < nums.length; j++) {
				currentSum += nums[j];
				result = Math.max(result, currentSum);
			}
		}
		return result;
	}

	private static int maximumSubArrayV2(int[] nums) {
		int result = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			result = Math.max(result, currentSum);
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return result;
	}
}
