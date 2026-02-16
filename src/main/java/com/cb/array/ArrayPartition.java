package com.cb.array;

public class ArrayPartition {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		System.out.println(partition(arr, 0, arr.length - 1));
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
