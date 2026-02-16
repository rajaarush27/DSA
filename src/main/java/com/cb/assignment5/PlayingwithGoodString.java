package com.cb.assignment5;

public class PlayingwithGoodString {
	public static void main(String[] args) {
		String str = "cbaeicde";
		play(str);
	}

	private static void play(String str) {
		int currentLength = 0;
		int maxLength = 0;

		for (char ch : str.toCharArray()) {
			if (isVowel(ch)) {
				currentLength++;
				maxLength = Math.max(maxLength, currentLength);
			} else {
				currentLength = 0;
			}
		}
		System.out.println(maxLength);
	}

	private static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}
