package com.cb.string;

public class LengthWiseSubString {

	public static void main(String[] args) {
		String str = "hello";
		subString(str);
	}

	private static void subString(String str) {
		for (int length = 1; length <= str.length(); length++) {
			for (int j = length; j <= str.length(); j++) {
				int i = j - length;
				System.out.println(str.substring(i, j));
			}
		}
	}
}
