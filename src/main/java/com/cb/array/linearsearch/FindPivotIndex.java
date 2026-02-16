package com.cb.array.linearsearch;

public class FindPivotIndex {
	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(nums));
	}

	private static int pivotIndex(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int leftSum = getSum(arr, 0, i - 1);
			int rightSum = getSum(arr, i + 1, arr.length - 1);
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

	private static int getSum(int[] arr, int i, int j) {
		int sum = 0;
		for (int k = i; k <= j; k++) {
			sum += arr[k];
		}
		return sum;
	}

}
