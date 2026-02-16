package com.cb.recursion;

public class ReplaceCharacter {

	public static void main(String[] args) {
        String str = "cat";
        System.out.println(replace(str, 0, ""));;
	}

	private static String replace(String str, int idx, String result) {
		if (idx == str.length()) {
			return result;
		}
		if (str.charAt(idx) == 'a') {
			result += 'o';
		} else {
			result += str.charAt(idx);
		}
		return replace(str, idx + 1, result);
	}
}
