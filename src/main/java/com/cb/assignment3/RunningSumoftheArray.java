package com.cb.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumoftheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int[] result = result(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	private static int[] result(int[] nums) {
		int[] result = new int[nums.length];
		result[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			result[i] = result[i - 1] + nums[i];
		}
		return result;
	}
}
