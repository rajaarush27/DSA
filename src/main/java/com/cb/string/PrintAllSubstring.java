package com.cb.string;

public class PrintAllSubstring {
	public static void main(String[] args) {
        print("hello");
	}

	private static void print(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j <= s1.length(); j++) {
				System.out.println(s1.substring(i, j));
			}
		}
	}
}
