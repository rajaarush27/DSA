package com.cb.array.binarysearch;

public class SortColor {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void sortColors(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int i = 0;
		while (i <= high) {
			if (nums[i] == 0) {
				int temp = nums[i];
				nums[i] = nums[low];
				nums[low] = temp;
				low++;
				i++;
			} else if (nums[i] == 2) {
				int temp = nums[i];
				nums[i] = nums[high];
				nums[high] = temp;
				high--;
			} else {
				i++;
			}
		}

	}
}
