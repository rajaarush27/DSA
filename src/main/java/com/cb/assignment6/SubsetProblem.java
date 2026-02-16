package com.cb.assignment6;

import java.util.Scanner;

public class SubsetProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		sc.close();
		printSubset(nums, 0, target, 0, "");
		System.out.println();
		System.out.println(count(nums, 0, target, 0));
	}

	private static void printSubset(int[] nums, int sum, int target, int idx, String ans) {
		if (idx == nums.length) {
			if (sum == target) {
				System.out.print(ans + " ");
			}
			return;
		}
		printSubset(nums, sum + nums[idx], target, idx + 1, ans + nums[idx] + " ");
		printSubset(nums, sum, target, idx + 1, ans);
	}
	
	private static int count(int[] nums, int sum, int target, int idx) {
		if (idx == nums.length) {
			return sum == target ? 1 : 0;
		}
		int include = count(nums, sum + nums[idx], target, idx + 1);
		int exclude = count(nums, sum, target, idx + 1);
		return include + exclude;
	}

}
