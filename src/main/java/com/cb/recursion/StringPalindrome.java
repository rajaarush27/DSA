package com.cb.recursion;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "madam";
		System.out.println(isPalindrome(str, true, 0, str.length() - 1));
	}

	private static boolean isPalindrome(String str, boolean result, int left, int right) {
		if (!result || left >= right) {
			return result;
		}
		if (str.charAt(left) == str.charAt(right)) {
			result = true;
		} else {
			result = false;
		}
		return isPalindrome(str, result, left + 1, right - 1);
	}

}
