package com.cb.assignment3;

public class MaximumCircularSum {

	public static void main(String[] args) {
		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
		System.out.println(circularSum(arr));
	}

	public static int circularSum(int[] arr) {
		int linearSum = KadanesAlgorithm(arr);
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
			arr[i] = arr[i] * -1;
		}
		int middleSum = KadanesAlgorithm(arr);
		int circularSum = totalSum + middleSum;
		if (circularSum == 0) {
			return linearSum;
		}
		return Math.max(linearSum, circularSum);
	}

	private static int KadanesAlgorithm(int[] nums) {
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
