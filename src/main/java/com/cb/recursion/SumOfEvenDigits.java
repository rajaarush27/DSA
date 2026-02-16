package com.cb.recursion;

public class SumOfEvenDigits {

	public static void main(String[] args) {
		int num = 12344;
		System.out.println(sum(num, 0));
	}

	private static int sum(int num, int sum) {
		if (num == 0) {
			return sum;
		}
		if ((num % 10) % 2 == 0) {
			sum += num % 10;
		}
		return sum(num / 10, sum);
	}
}
