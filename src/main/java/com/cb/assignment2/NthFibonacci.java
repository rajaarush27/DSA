package com.cb.assignment2;

public class NthFibonacci {

	public static void main(String[] args) {
		fibonacci(8);
	}

	private static void fibonacci(int num) {
		int a = 0, b = 1;
		System.out.print(a + "," + b);
		for (int i = 1; i <= num; i++) {
			int c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;
		}
	}
}
