package com.cb.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = { 5, 1, 4, 2, 3 };
		bubble(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void bubble(int[] nums) {
		for (int turn = 1; turn < nums.length; turn++) {
			for (int i = 0; i < nums.length - turn; i++) {
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
	}
}
