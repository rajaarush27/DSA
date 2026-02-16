package com.cb.recursion;

public class Permutation2 {
	public static void main(String[] args) {
		print("ABCA", "");
	}

	private static void print(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!isPresent(str, ch, i + 1)) {
				String rest = str.substring(0, i) + str.substring(i + 1);
				print(rest, ans + ch);
			}
		}
	}

	private static boolean isPresent(String str, char ch, int idx) {
		for (int i = idx; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return true;
			}
		}
		return false;
	}
}
