package com.cb.twodarray;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		calculate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void calculate(int[] nums, int k) {
		int y = 0;
		for (int i = k + 1; i < nums.length; i++) {
			int temp1 = nums[y]; // 1
			int temp2 = nums[i - 1];
			nums[y] = nums[i]; // 5
			nums[i - 1] = temp1; //
			nums[i] = temp2;
			y++;
		}
	}
}
