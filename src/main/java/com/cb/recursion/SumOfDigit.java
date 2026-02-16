package com.cb.recursion;

public class SumOfDigit {

	public static void main(String[] args) {
		int num = 123;
		System.out.println(sumOfDigit(num, 0));
	}

	private static int sumOfDigit(int num, int sum) {
		if (num == 0) {
			return sum;
		}
		sum += num % 10;
		return sumOfDigit(num / 10, sum);
	}

}
