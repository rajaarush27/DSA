package com.cb.math;

public class SumOfDigit {
	public static void main(String[] args) {
		int sum = 0;
		int num = 1876;
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println(sum);
	}
}
