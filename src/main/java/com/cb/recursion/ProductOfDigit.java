package com.cb.recursion;

public class ProductOfDigit {

	public static void main(String[] args) {
		int num = 234;
		System.out.println(product(num));
	}

	private static int product(int num) {
		if (num == 0) {
			return 1;
		}
		return num % 10 * product(num / 10);
	}
}
