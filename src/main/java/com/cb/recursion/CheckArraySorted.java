package com.cb.recursion;

public class CheckArraySorted {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4};
		System.out.println(isSorted(arr, 0, true));
	}

	private static boolean isSorted(int[] arr, int idx, boolean result) {
		if (!result || idx == arr.length - 1) {
			return result;
		}
		if (arr[idx] < arr[idx + 1]) {
			result = true;
		} else {
			result = false;
		}
		return isSorted(arr, idx + 1, result);
	}
}
