package com.cb.assignment3;

import java.util.Scanner;

public class ProductOfAnArrayExceptItSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int[] result = productOfArrayV2(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	private static int[] productOfArray(int[] nums) {
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

	private static int[] productOfArrayV2(int[] nums) {
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
}
