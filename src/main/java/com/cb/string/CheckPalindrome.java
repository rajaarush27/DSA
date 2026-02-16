package com.cb.string;

public class CheckPalindrome {
	public static void main(String[] args) {
		String str = "Oyo";
		System.out.println(palindrome(str));
	}

	private static boolean palindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		str = str.toLowerCase();
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
