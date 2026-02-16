package com.cb.assignment5;

public class StringsCountPalindromicSubstrings {
	public static void main(String[] args) {
		String str = "abbc";
		countSubstring(str);
	}

	private static void countSubstring(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				if (isPalindrome(sub)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left <= right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
