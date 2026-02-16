package com.cb.leetcode;

import java.util.Arrays;

public class LeetCode2574 {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 8, 3 };
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 0;
		right[n - 1] = 0;
		int[] result = new int[n];

		for (int i = 1; i < n; i++) { // prefix
			left[i] = left[i - 1] + arr[i - 1];
		}

		for (int i = n - 2; i >= 0; i--) { // suffix
			right[i] = right[i + 1] + arr[i + 1];
		}

		for (int i = 0; i < n; i++) {
			result[i] = right[i] - left[i];
			if (result[i] < 0) {
				result[i] = (result[i] * -2) + result[i];
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
