package com.cb.recursion;

public class FirstOccurance {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 4 };
		int item = 4;
		System.out.println(index(arr, item, 0));
	}

	private static int index(int[] arr, int item, int idx) {
		if (idx == arr.length - 1) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return index(arr, item, idx + 1);
	}
}
