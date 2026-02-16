package com.cb.recursion;

public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		int a = 4, b = 6;
		System.out.println(lcm(a, b));
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		int rem = a % b;
		return gcd(b, rem);
	}
}
