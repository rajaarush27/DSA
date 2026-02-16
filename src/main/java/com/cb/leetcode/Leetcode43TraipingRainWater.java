package com.cb.leetcode;

public class Leetcode43TraipingRainWater {
	public static void main(String[] args) {
		int[] height = { 5, 3, 1, 2, 7, 6, 1, 6 };
		trappedWater(height);
	}

	private static void trappedWater(int[] height) {
		int n = height.length;
		int[] prefix = new int[n];
		int[] suffix = new int[n];

		prefix[0] = height[0];
		suffix[n - 1] = height[n - 1];

		for (int i = 1; i < height.length; i++) {
			prefix[i] = Math.max(prefix[i - 1], height[i]);
		}

		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = Math.max(suffix[i + 1], height[i]);
		}
		int sum = 0;
		for (int i = 0; i < height.length; i++) {
			sum += Math.min(prefix[i], suffix[i]) - height[i];
		}
		System.out.println(sum);
	}
}
