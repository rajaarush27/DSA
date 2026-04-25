package com.cb.slidingwindow;

public class MaximumSubOfWindowSizeK {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 2, 1 };
		int k = 3;
		System.out.println(maximumSum(arr, k));
	}

	public static int maximumSum(int[] arr, int k) {
		// 1st. window ka answer
		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}

		int ans = sum;
		for (int i = k; i < arr.length; i++) {
			// 1. window grow
			sum += arr[i];
			// 2. window shrink
			sum -= arr[i - k];
			// 3. answer update
			ans = Math.max(ans, sum);
		}
		return ans;
	}
}
