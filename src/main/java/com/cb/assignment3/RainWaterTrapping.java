package com.cb.assignment3;

import java.util.Scanner;

public class RainWaterTrapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] nums = new int[n];
		while (t-- > 0) {
			trappedRainWater(nums);
		}
	}

	private static void trappedRainWater(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		int trappedWater = 0;

		while (left < right) {
			if (nums[leftMax] <= nums[rightMax]) {
				if (nums[left] >= leftMax) {
					leftMax = nums[left];
				} else {
					trappedWater += leftMax - nums[left];
				}
				left++;
			} else {
				if (nums[right] >= rightMax) {
					rightMax = nums[right];
				} else {
					trappedWater += rightMax - nums[right];
				}
				right--;
			}
		}
		System.out.println(trappedWater);
	}
}
