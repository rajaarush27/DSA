package com.cb.recursion;

public class PrintAllIndexes {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		print(arr, 0, 2);
	}

	private static void print(int[] arr, int idx, int item) {
		if (idx == arr.length) {
			return;
		}
		if (arr[idx] == item) {
			System.out.print(idx + " ");
		}
		print(arr, idx + 1, item);
	}
}
