package com.cb.recursion;

public class CountVowelsInString {

	public static void main(String[] args) {
		String str = "aarush";
		System.out.println(countVowels(str, 0, 0));
	}

	private static int countVowels(String str, int idx, int count) {
		if (idx == str.length()) {
			return count;
		}
		if (str.charAt(idx) == 'a' || str.charAt(idx) == 'e' || str.charAt(idx) == 'i' || str.charAt(idx) == 'o'
				|| str.charAt(idx) == 'u') {
			count++;
		}
		return countVowels(str, idx + 1, count);
	}
}
