package com.cb.recursion;

public class SmallestDigit {

	public static void main(String[] args) {
		int num = 492;
		System.out.println(smallest(num, num % 10));
	}

	private static int smallest(int num, int small) {
		if (num == 0) {
			return small;
		}
		int rem = num % 10;
		if (small > rem) {
			small = rem;
		}
		return smallest(num / 10, small);
	}
}
