package com.cb.recursion;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		System.out.println(gcd(a, b));
	}

	private static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		int rem = a % b;
		return gcd(b, rem);
	}

}
