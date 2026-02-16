package com.cb.recursion;

public class LastOccurrence {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2 };
		int k = 2;
		System.out.println(occurance(arr, k, arr.length - 1));
	}

	private static int occurance(int[] arr, int item, int idx) {
		if (idx <= 0) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return occurance(arr, item, idx - 1);
	}
}
