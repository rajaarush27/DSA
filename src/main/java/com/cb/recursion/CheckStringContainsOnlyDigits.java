package com.cb.recursion;

public class CheckStringContainsOnlyDigits {

	public static void main(String[] args) {
		String value = "12340";
		System.out.println(contains(value, 0, true));
	}

	private static boolean contains(String str, int idx, boolean result) {
		if (!result || idx == str.length()) {
			return result;
		}
		if (Character.isDigit(str.charAt(idx))) {
			result = true;
		} else {
			result = false;
		}
		return contains(str, idx + 1, result);
	}
}
