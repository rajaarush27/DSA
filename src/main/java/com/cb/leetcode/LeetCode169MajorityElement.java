package com.cb.leetcode;

public class LeetCode169MajorityElement {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 2, 2, 1, 1, 2, 2 };
		System.out.println(mooreVoting(nums));
	}

	private static int mooreVoting(int[] nums) {
		int e = nums[0];
		int vote = 1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == e) {
				vote++;
			} else {
				vote--;
				if (vote == 0) {
					e = nums[i];
					vote = 1;
				}
			}
		}
		return e;
	}
}
