package com.cb.leetcode;

public class LeetCode189RotateArrayReversalAlgorithm {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 5;
		rotateArrayKTimes(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void rotateArrayKTimes(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		// starting ke n-k element reverse
		reverseArrayInRange(arr, 0, n - k - 1);

		// last ke k element reverse
		reverseArrayInRange(arr, n - k, n - 1);

		// saare ka reverse reverse
		reverseArrayInRange(arr, 0, n - 1);

	}

	private static void reverseArrayInRange(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
