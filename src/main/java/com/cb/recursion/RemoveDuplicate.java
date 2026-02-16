package com.cb.recursion;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "aaabb";
		System.out.println(remove(str, 0, ""));
	}

	private static String remove(String str, int idx, String result) {
		if (idx == str.length()) {
			return result;
		}
		Character ch = str.charAt(idx);
		if (!result.contains(ch.toString())) {
			result += ch;
		}
		return remove(str, idx + 1, result);
	}

}
