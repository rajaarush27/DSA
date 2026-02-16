package com.cb.recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(convert(0, 1, num));
	}

	private static int convert(int sum, int mul, int num) {
		if (num == 0) {
			return sum;
		}
		int rem = num % 2;
		return convert(sum + rem * mul, mul *= 10, num / 2);
	}
}
