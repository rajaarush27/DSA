
package com.cb.slidingwindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LeetCode239 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] ans = slidingWindowMaximum(nums, k);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] slidingWindowMaximum(int[] nums, int k) {
		int n = nums.length;
		int[] ans = new int[n - k + 1];
		int j = 0;
		Deque<Integer> dq = new ArrayDeque<>();

		// 1st window ki
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && nums[i] > nums[dq.getLast()]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		ans[j++] = nums[dq.getFirst()];

		for (int i = k; i < nums.length; i++) {
			// 1. window grow
			while (!dq.isEmpty() && nums[i] > nums[dq.getLast()]) {
				dq.remove();
			}
			dq.add(i);
			// 2. window shrink
			if (i - k == dq.getFirst()) {
				dq.removeFirst();
			}
			// 3. answer update
			ans[j++] = nums[dq.getFirst()];
		}
		return ans;
	}
}
