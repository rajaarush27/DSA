package com.cb.devideAndConcur;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 2, 1, 8, 3, 4 };
		sort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	private static void sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int idx = partition(arr, si, ei);
		sort(arr, si, idx - 1);
		sort(arr, idx + 1, ei);
	}

	private static int partition(int[] nums, int si, int ei) {
		int item = nums[ei];
		int idx = si;

		for (int i = si; i < ei; i++) {
			if (nums[i] < item) {
				int temp = nums[i];
				nums[i] = nums[idx];
				nums[idx] = temp;
				idx++;
			}
		}
		int temp = nums[ei];
		nums[ei] = nums[idx];
		nums[idx] = temp;
		return idx;
	}

}
