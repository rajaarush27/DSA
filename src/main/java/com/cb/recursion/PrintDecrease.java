package com.cb.recursion;

public class PrintDecrease {

	public static void main(String[] args) {
		int n = 5;
		printNum(n);
	}

	private static void printNum(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNum(n - 1);
	}

}
