package com.cb.assignment5;

public class StringsRemoveDuplicates {
	public static void main(String[] args) {
		String str = "aabccba";
		removeDuplicate(str);
	}

	private static void removeDuplicate(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (result.length() > 0 && str.charAt(i) == str.charAt(i - 1))
				continue;
			result += str.charAt(i);
		}
		System.out.println(result);
	}
}
