package com.cb.leetcode;

public class LeetCode33SearchInRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(search(arr, target));
	}

	private static int search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[left] <= arr[mid]) { // mid present in upper line
				if (arr[left] <= target && arr[mid] > target) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (arr[right] >= target && arr[mid] < target) { // mid present in lower line
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}
}
