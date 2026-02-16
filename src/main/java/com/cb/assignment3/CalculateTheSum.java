package com.cb.assignment3;

import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int x = sc.nextInt();
			nums = updatedArray(nums, x);
		}
		long ans = 0;
		int mod = 1000_000_007;
		for (int i = 0; i < nums.length; i++) {
			ans = (ans + nums[i]) % mod;
		}
		System.out.println((int) ans);
	}

	private static int[] updatedArray(int[] nums, int x) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			int j = i - x;
			if (j < 0) {
				j += nums.length;
			}
			arr[i] = nums[i]+nums[j];
		}
		return arr;
	}

}
