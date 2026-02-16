package com.cb.assignment5;

import java.util.Scanner;

public class StringsOddEvenCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		arrangeCharacter(value);
		sc.close();
	}

	private static void arrangeCharacter(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i % 2 == 0) {
				result += (char) (ch + 1);
			} else {
				result += (char) (ch - 1);
			}
		}
		System.out.println(result);
	}
}
