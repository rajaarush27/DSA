package com.cb.assignment3;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int t = n;
		while (t-- > 0) {
			nums[t] = sc.nextInt();
		}
		sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

	private static void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			insertLastElement(nums, i);
		}
	}

	private static void insertLastElement(int[] nums, int i) {
		int j = i - 1;
		int item = nums[i];
		while (j >= 0 && nums[j] > item) {
			nums[j + 1] = nums[j];
			nums[j] = item;
			j--;
		}
	}
}
