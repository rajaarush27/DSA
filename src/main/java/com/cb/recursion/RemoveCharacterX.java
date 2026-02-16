package com.cb.recursion;

public class RemoveCharacterX {

	public static void main(String[] args) {
		String str = "xoxo";
		System.out.println(remove(str, 0, ""));
	}

	private static String remove(String str, int idx, String result) {
		if (idx == str.length()) {
			return result;
		}
		if (str.charAt(idx) != 'x') {
			result += str.charAt(idx);
		}
		return remove(str, idx + 1, result);
	}
}
