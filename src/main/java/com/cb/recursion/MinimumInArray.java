package com.cb.recursion;

public class MinimumInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 3 };
		System.out.println(minimumElement(arr, arr[0], 0));
	}

	private static int minimumElement(int[] arr, int min, int idx) {
		if (idx == arr.length - 1) {
			return min;
		}
		if (min > arr[idx + 1]) {
			min = arr[idx + 1];
		}
		return minimumElement(arr, min, idx + 1);
	}
}
