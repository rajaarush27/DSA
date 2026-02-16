package com.cb.recursion;

public class PrintArrayInReverse {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int[] result = print(arr, arr.length - 1, new int[arr.length], 0);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	private static int[] print(int[] arr, int idx, int[] result, int idx2) {
		if (idx < 0) {
			return result;
		}
		result[idx2] = arr[idx];
		return print(arr, idx-1, result, idx2+1);
	}
}
