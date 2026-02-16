package com.cb.recursion;

public class CountElementOccurrences {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 3, 2, 1, 5, 2 };
		int key = 1;
		System.out.println(elementOccurranceCount(arr, key, 0, 0));
	}

	private static int elementOccurranceCount(int[] arr, int item, int idx, int count) {
		if (idx == arr.length) {
			return count;
		}
		if (arr[idx] == item) {
			count++;
		}
		return elementOccurranceCount(arr, item, idx + 1, count);

	}
}
