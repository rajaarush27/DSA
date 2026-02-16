package com.cb.assignment5;

import java.util.Scanner;

public class StringsisPalindrome {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.next();
         System.out.println(isPalidrome(str));
         sc.close();
	}

	private static boolean isPalidrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left <= right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
