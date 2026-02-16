package com.cb.recursion;

public class MaximumElementArray {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3 };
		System.out.println(maximumElement(arr, arr[0], 0));
	}

	private static int maximumElement(int[] arr, int max, int idx) {
		if (idx == arr.length - 1) {
			return max;
		}

		if (max < arr[idx + 1]) {
			max = arr[idx + 1];
		}
		return maximumElement(arr, max, idx + 1);
	}

}
