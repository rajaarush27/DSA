package com.cb.assignment3;

import java.util.Scanner;

public class SortjustZeroesOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int[] result = zeroAndOnes(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	private static int[] zeroAndOnes(int[] nums) {
		int[] result = new int[nums.length];
		int count = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				result[count--] = nums[i];
			}
		}
		return result;
	}
}
