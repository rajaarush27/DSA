package com.cb.recursion;

public class LargestDigit {

	public static void main(String[] args) {
		int num = 492;
		System.out.println(largest(num, num % 10));
	}

	private static int largest(int num, int large) {
		if (num == 0) {
			return large;
		}
		int rem = num % 10;
		if (large < rem) {
			large = rem;
		}
		return largest(num / 10, large);
	}
}
