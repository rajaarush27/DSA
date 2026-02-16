package com.cb.assignment3;

import java.util.Scanner;

public class ArraysTargetSumPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		if (sc.nextInt() > 0 && sc.nextInt() < 1000) {
			n = sc.nextInt();
		}
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		getPair(nums, target);
	}

	private static void getPair(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println(nums[i] + " and " + nums[j]);
				}
			}
		}
	}
}
