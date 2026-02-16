package com.cb.assignment2;

public class ReplaceThemAll {
	public static void main(String[] args) {
		long num = 1020;
		long val = 0;
		long mul = 1;
		while (num > 0) {
			long rem = num % 10;
			if (rem == 0) {
				rem = 5;
			}
			val = val + rem * mul;
			mul *= 10;
			num /= 10;
		}
		System.out.println(val);
	}
}
