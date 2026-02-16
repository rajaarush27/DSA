package com.cb.assignment5;

import java.util.Scanner;

public class StringsToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		toggleCase(value);
		sc.close();

	}

	private static void toggleCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 97 & ch <= 122) {
				result += (char) (ch - 32);
			} else if (ch >= 65 & ch <= 90) {
				result += (char) (ch + 32);
			}
		}
		System.out.println(result);
	}
}
