package com.cb.assignment3;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		selectionSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int min = minIndexInArray(nums, i);
			int temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
		}
	}

	private static int minIndexInArray(int[] nums, int idx) {
		int min = idx;
		for (int i = idx + 1; i < nums.length; i++) {
			if (nums[i] < nums[min]) {
				min = i;
			}
		}
		return min;
	}
}
