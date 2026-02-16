package com.cb.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = { 4, -1, 5, 3, 2, 1, 7 };
		selection(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void selection(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int min = minFromIthIndex(nums, i);
			int temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
		}
	}

	private static int minFromIthIndex(int[] nums, int idx) {
		int min = idx;
		for (int i = idx + 1; i < nums.length; i++) {
			if (nums[i] < nums[min]) {
				min = i;
			}
		}
		return min;
	}
}
