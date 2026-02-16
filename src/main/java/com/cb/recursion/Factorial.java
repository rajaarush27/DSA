package com.cb.recursion;

public class Factorial {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(fact(x));
	}

	private static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int x = fact(n - 1);
		return x * n;
	}

}
