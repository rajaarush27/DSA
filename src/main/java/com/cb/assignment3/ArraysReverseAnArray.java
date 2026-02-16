package com.cb.assignment3;

import java.util.Scanner;

public class ArraysReverseAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		reverseAnArray(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void reverseAnArray(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}

}
