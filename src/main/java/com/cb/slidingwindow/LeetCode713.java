package com.cb.slidingwindow;

public class LeetCode713 {

	public static void main(String[] args) {
		int[] nums = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(subArrayProductLessThenK(nums, k));
	}

	private static int subArrayProductLessThenK(int[] arr, int k) {
		int si = 0, ei = 0, p = 1, ans = 0;
		while (ei < arr.length) {
			// window grow
			p *= arr[ei];

			// window shrink
			while (p >= k && si <= ei) {
				p /= arr[si];
				si++;
			}

			// answer update
			ans += (ei - si + 1);
			ei++;
		}
		return ans;
	}
}
