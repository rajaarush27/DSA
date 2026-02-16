package com.cb.assignment5;

public class StringsDifferenceinAsciiCodes {
	public static void main(String[] args) {
		difference("acb");
	}

	private static void difference(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ch2 = i < str.length() ? str.charAt(i + 1) : str.charAt(i);
			int diff = ch - ch2;
			result += (char) (ch)+String.valueOf(diff)+(char)(ch2);
		}
		System.out.println(result);
	}
}
