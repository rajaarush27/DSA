package com.cb.assignment2;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(lcm(a, b));
	}

	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		while (a % b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		return b;
	}
}
