package com.cb.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresofaSortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int[] result = squareOfArray(nums);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static int[] squareOfArray(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[i] * nums[i];
		}
		sortOfArray(arr);
		return arr;
	}

	private static void sortOfArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int min = minFromIndex(nums, i);
			int temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
		}
	}

	private static int minFromIndex(int[] nums, int idx) {
		int min = idx;
		for (int i = idx + 1; i < nums.length; i++) {
			if (nums[i] < nums[min]) {
				min = i;
			}
		}
		return min;
	}

}
