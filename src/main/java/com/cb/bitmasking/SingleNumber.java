package com.cb.bitmasking;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 5, 4, 2 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		return xor;
	}
}
