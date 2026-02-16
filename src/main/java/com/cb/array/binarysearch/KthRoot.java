package com.cb.array.binarysearch;

public class KthRoot {
	public static void main(String[] args) {
		System.out.println(getMaximumKth(149, 3));
	}

	private static int getMaximumKth(int right, int k) {
		int left = 1;
		int ans = 0;
		int n = right;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			int value = (int) Math.pow(mid, k);
			if (value <= n) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;
	}
}
