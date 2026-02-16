package com.cb.recursion;

public class PrintSubsequence {

	public static void main(String[] args) {
		String str = "abc";
		subsequence(str, "");
	}

	private static void subsequence(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		subsequence(str.substring(1), ans);
		subsequence(str.substring(1), ans + ch);
	}
}
