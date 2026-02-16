package com.cb.array.linearsearch;

public class FindPivotIndex2 {
	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(nums));
		System.out.println(pivotIndex2(nums));
	}

	private static int pivotIndex(int[] arr) {
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		left[0] = 0;
		right[n - 1] = 0;

		for (int i = 1; i < n; i++) { // prefix
			left[i] = left[i - 1] + arr[i - 1];
		}

		for (int j = n - 2; j >= 0; j--) { // suffix
			right[j] = right[j + 1] + arr[j + 1];
		}

		// calculation
		for (int i = 0; i < n; i++) {
			if (left[i] == right[i]) {
				return i;
			}
		}
		return -1;
	}

	private static int pivotIndex2(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		int left = 0;
		for (int i = 0; i < arr.length; i++) {
			int right = sum - left - arr[i];
			if (left == right) {
				return i;
			}
			left += arr[i];
		}
		return -1;
	}

}
