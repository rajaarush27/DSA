package com.cb.recursion;

public class RemoveZerosFromNumber {

	public static void main(String[] args) {
		int num = 1020100;
		System.out.println(remove(num, 0, 1));
	}

	private static int remove(int num, int result, int mul) {
		if (num == 0) {
			return result;
		}
		int rem = num % 10;
		if (rem != 0) {
			result = result + rem * mul;
			mul *= 10;
		}
		return remove(num / 10, result, mul);
	}
}
