package com.cb.bitmasking;

public class SubsequenceWithoutRecursion {

	public static void main(String[] args) {
		String s = "abc";
		print(s);
	}

	public static void print(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			pattern(s, i);
		}
	}

	private static void pattern(String s, int i) {
		String ans = "";
		int pos = 0;
		while (i > 0) {
			if ((i & 1) == 1) {
				ans += s.charAt(pos);
			}
			i >>= 1;
			pos++;
		}
		System.out.println(ans);
	}
}
