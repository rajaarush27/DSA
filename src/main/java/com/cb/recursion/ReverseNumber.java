package com.cb.recursion;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 5893;
		int reverse = 0;
		System.out.println(reverseNum(reverse, num));
	}

	private static int reverseNum(int reverse, int n) {
		if (n == 0) {
			return reverse;
		}
		int rem = n % 10;
		return reverseNum((reverse * 10) + rem, n / 10);
	}
}
