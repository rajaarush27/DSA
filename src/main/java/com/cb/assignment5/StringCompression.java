package com.cb.assignment5;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		compress(value);
		sc.close();
	}

	private static void compress(String str) {
		int count = 1;
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i+1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				result = result + str.charAt(i) + count;
				count = 1;
			}
		}
		System.out.println(result);
	}
}
