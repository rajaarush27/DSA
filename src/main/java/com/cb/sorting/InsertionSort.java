package com.cb.sorting;

public class InsertionSort {
	public static void main(String[] args) {
//		int[] nums = { 1, 4, 7, 8, 9, 11, 2 };
//		insertLastElement(nums, nums.length - 1);

		int[] nums = { 9, 1, 7, 4, 8, 2, 11 };
		sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			insertLastElement(nums, i);
		}
	}

	public static void insertLastElement(int[] nums, int i) {
		int j = i - 1;
		int item = nums[i];
		while (j >= 0 && nums[j] > item) {
			nums[j + 1] = nums[j];
			nums[j] = item;
			j--;
		}
	}
}
