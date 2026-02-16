package com.cb.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptItSelf {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] result = productOfArray(arr);
		int[] result2 = productOfArrayV2(arr);
		int[] result3 = productOfArrayV3(arr);
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
		System.out.println(Arrays.toString(result3));
	}

	private static int[] productOfArray(int[] nums) {
		int n = nums.length;
		int[] prefix = new int[n];
		int[] suffix = new int[n];

		prefix[0] = 1;
		suffix[n - 1] = 1;

		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] * nums[i - 1];
		}
		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] * nums[i + 1];
		}
		for (int i = 0; i < n; i++) {
			prefix[i] = prefix[i] * suffix[i];
		}
		return prefix;
	}

	private static int[] productOfArrayV2(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int prefix = 1;

		for (int i = 0; i < n; i++) {
			result[i] = prefix;
			prefix *= nums[i];
		}
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * suffix;
			suffix *= nums[i];
		}
		return result;
	}

	private static int[] productOfArrayV3(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * suffix;
			suffix *= nums[i];
		}
		return result;
	}

}
