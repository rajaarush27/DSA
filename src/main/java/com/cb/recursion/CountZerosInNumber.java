package com.cb.recursion;

public class CountZerosInNumber {

	public static void main(String[] args) {
		int num = 10020;
		System.out.println(countNum(num, 0));
	}

	private static int countNum(int num, int count) {
		if (num == 0) {
			return count;
		}
		if (num % 10 == 0) {
			count++;
		}
		return countNum(num / 10, count);
	}
}
