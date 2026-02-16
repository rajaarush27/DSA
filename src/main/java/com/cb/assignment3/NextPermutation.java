package com.cb.assignment3;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		nextLargestPermutation(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] +" ");
		}
	}

	private static void nextLargestPermutation(int[] nums) {
		int p = -1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				p = i;
				break;
			}
		}
		if (p == -1) {
			reverse(nums, 0, nums.length - 1);
			return;
		}
		int q = -1;
		for (int i = nums.length - 1; i > p; i--) {
			if (nums[p] < nums[i]) {
				q = i;
				break;
			}
		}
		int temp = nums[p];
		nums[p] = nums[q];
		nums[q] = temp;
		reverse(nums, p + 1, nums.length - 1);
	}

	private static void reverse(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

	}

}
