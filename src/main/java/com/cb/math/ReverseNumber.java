package com.cb.math;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 6781;
		int result = 0;
		while (num > 0) {
			int d = num % 10;
			result = result * 10 + d;
			num /= 10;
		}
		System.out.println(result);
	}
}
