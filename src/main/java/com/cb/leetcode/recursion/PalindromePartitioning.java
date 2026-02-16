package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	public static void main(String[] args) {
		String str = "aab";
		List<String> list = new ArrayList<>();
		List<List<String>> result = new ArrayList<>();
		partition(str, list, result);
		System.out.println(result);
	}

	private static void partition(String qns, List<String> list, List<List<String>> result) {
		if (qns.length() == 0) {
			result.add(new ArrayList<>(list));
			return;
		}

		for (int i = 1; i <= qns.length(); i++) {
			String s = qns.substring(0, i);
			if (isPalindrome(s)) {
				list.add(s);
				partition(qns.substring(i), list, result);
				list.remove(list.size() - 1);
			}
		}
	}

	private static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
