package com.cb.string;

public class LexicographicalOrder {
	public static void main(String[] args) {
		String s1 = "Kunal";
		String s2 = "Komal";
		System.out.println(compareToOwnMethod(s1, s2));
		String s3 = "Ankit";
		String s4 = "Ankita";
		System.out.println(compareToOwnMethod(s3, s4));
	}

	private static int compareToOwnMethod(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int n = s1.length() < s2.length() ? s1.length() : s2.length();
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();
	}
}
