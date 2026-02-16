package com.cb.assignment5;

import java.util.Scanner;

public class CanYouReadThis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		read(value);
		sc.close();
	}

	private static void read(String str) {
		String[] words = str.split("(?=[A-Z])");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

}
