package com.cb.math;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		int n = 25;
		System.out.println(countPrime(n));
	}

	private static int countPrime(int n) {
		int[] nums = new int[n + 1];
		nums[0] = 1; // Not Prime
		nums[1] = 1; // Not Prime

		for (int i = 2; i * i <= nums.length; i++) {
			if (nums[i] == 0) { // i ek prime number hai
				for (int j = 0; i * j < nums.length; j++) {
					nums[i * j] = 1;
				}
			}
		}
		int c = 0;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] == 0) {
				c++;
			}
		}
		return c;
	}
}
