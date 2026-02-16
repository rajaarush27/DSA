package com.cb.assignment3;

public class MaximumSumPathInTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int[] nums2 = { 1, 5, 7, 8, 10, 15, 16, 19 };
		System.out.println(maximumSum(nums1, nums2));
	}

	private static int maximumSum(int[] nums1, int[] nums2) {
		long result = 0;
		int i = 0;
		int j = 0;
		int s1 = 0;
		int s2 = 0;
		long mode = 1000_000_007;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				long sum1 = getSumOfArray(nums1, s1, i);
				long sum2 = getSumOfArray(nums2, s2, j);
				result = result + (Math.max(sum1, sum2)) % mode;
				i++;
				j++;
				s1 = i;
				s2 = j;
			}
		}
		long sum1 = getSumOfArray(nums1, s1, nums1.length - 1);
		long sum2 = getSumOfArray(nums2, s2, nums2.length - 1);
		result = result + (Math.max(sum1, sum2)) % mode;
		return (int) result;
	}

	private static long getSumOfArray(int[] nums, int si, int ei) {
		long sum = 0;
		for (int j = si; j <= ei; j++) {
			sum += nums[j];
		}
		return sum;
	}

}
