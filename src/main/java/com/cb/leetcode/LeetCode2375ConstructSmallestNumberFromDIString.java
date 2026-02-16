package com.cb.leetcode;

import java.util.Stack;

public class LeetCode2375ConstructSmallestNumberFromDIString {
	public static void main(String[] args) {
		String s = "IIIDIDDD";
		System.out.println(smallestNumber(s));
	}

	private static String smallestNumber(String str) {
		int[] nums = new int[str.length() + 1];
		int c = 1;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				nums[i] = c++;
				while (!stack.isEmpty()) {
					nums[stack.pop()] = c++;
				}
			} else {
				stack.push(i);
			}
		}
		String ans = "";
		for (int i = 0; i < nums.length; i++) {
			ans += nums[i];
		}
		return ans;
	}
}
