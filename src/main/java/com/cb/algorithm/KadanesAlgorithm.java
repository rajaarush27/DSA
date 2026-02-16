package com.cb.algorithm;

public class KadanesAlgorithm {
	public static void main(String[] args) {

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
