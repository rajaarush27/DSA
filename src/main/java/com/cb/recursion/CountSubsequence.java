package com.cb.recursion;

public class CountSubsequence {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(subsequence(str, ""));
	}

	private static int subsequence(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		char ch = str.charAt(0);
		int f = subsequence(str.substring(1), ans);
		int s = subsequence(str.substring(1), ans + ch);
		return f + s;
	}
}
