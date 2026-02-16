package com.cb.array;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		int item = 5;
		System.out.println(getIndexOfArray(arr, item));
	}

	private static int getIndexOfArray(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
