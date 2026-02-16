package com.cb.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class PairofRoses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] roses = new int[n];
			for (int i = 0; i < n; i++) {
				roses[i] = sc.nextInt();
			}
			int p = sc.nextInt();
			findTheBestPriceToBuyRosed(roses, p);
		}
		sc.close();
	}

	private static void findTheBestPriceToBuyRosed(int[] nums, int prices) {
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length - 1;
		int minDiff = Integer.MAX_VALUE;
		int a = 0, b = 0;

		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum == prices) {
				int diff = nums[right] - nums[left];
				if (diff < minDiff) {
					minDiff = diff;
					a = nums[left];
					b = nums[right];
				}
				left++;
				right--;
			} else if (sum < prices) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + a + " and " + b);
	}

}
