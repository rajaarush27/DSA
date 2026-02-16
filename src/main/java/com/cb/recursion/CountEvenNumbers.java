package com.cb.recursion;

public class CountEvenNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 5, 8, 6 };
		System.out.println(countNum(arr, 0, 0));
	}

	private static int countNum(int[] arr, int idx, int count) {
		if (idx == arr.length) {
			return count;
		}
		if (arr[idx] % 2 == 0) {
			count++;
		}
		return countNum(arr, idx + 1, count);
	}
}
