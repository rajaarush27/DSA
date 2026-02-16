package com.cb.recursion;

public class CountWords {

	public static void main(String[] args) {
		String str = "I love code";
		System.out.println(count(str, 0, 0));
	}

	private static int count(String str, int idx, int count) {
		String[] strg = str.split(" +");
		if (idx == strg.length) {
			return count;
		}
		count++;
		return count(str, idx + 1, count);
	}
}
