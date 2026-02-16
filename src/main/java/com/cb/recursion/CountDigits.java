package com.cb.recursion;

public class CountDigits {

	public static void main(String[] args) {
		int n = 9876;
		System.out.println(countDigit(n));
	}

	private static int countDigit(int n) {
		if (n <= 0) {
			return 0;
		}
		int k = countDigit(n / 10);
		k++;
		return k;

	}

}
