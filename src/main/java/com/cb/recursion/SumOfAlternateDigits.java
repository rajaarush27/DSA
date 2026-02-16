package com.cb.recursion;

public class SumOfAlternateDigits {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(sumNum(num, 0, 1));
	}

	private static int sumNum(int num, int sum, int count) {
		if (num == 0) {
			return sum;
		}
		int rem = num % 10;

		if (count % 2 == 0) {
			sum += rem;
		}
		count++;
		return sumNum(num / 10, sum, count);
	}
}
