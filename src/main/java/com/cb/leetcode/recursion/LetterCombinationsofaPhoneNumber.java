package com.cb.leetcode.recursion;

public class LetterCombinationsofaPhoneNumber {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String qns = "79";
		keypad(qns, "");
	}

	private static void keypad(String qns, String ans) {
		if (qns.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = qns.charAt(0); // 2;
		String get = key[ch - '0'];// abc
		for (int i = 0; i < get.length(); i++) {
			keypad(qns.substring(1), ans + get.charAt(i));
		}
	}

}
