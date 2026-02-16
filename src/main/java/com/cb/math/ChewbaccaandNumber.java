package com.cb.math;

import java.util.Scanner;

public class ChewbaccaandNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long result = chewbacca(n);
		System.out.println(result);
	}

	private static long chewbacca(long n) {
		long num = 0;
		long mul = 1;

		while (n > 9) {
			long rem = n % 10;
			if (9 - rem < rem) {
				rem = 9 - rem;
			}
			num = num + rem * mul;
			mul = mul * 10;
			n /= 10;
		}
		if (n == 9 || n < 5) {
			num = num + n * mul;
		} else {
			num = num + (9 - n) * mul;
		}
		return num;
	}
}
