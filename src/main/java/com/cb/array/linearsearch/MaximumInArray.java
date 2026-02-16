package com.cb.array.linearsearch;

public class MaximumInArray {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		System.out.println(getMaxValueInArray(arr));
	}

	private static int getMaxValueInArray(int[] arr) {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
}
