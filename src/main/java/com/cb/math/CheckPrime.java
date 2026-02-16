package com.cb.math;

public class CheckPrime {
	public static void main(String[] args) {
       int n = 65781;
       System.out.println(isPrime(n));
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		int div = 2;
		while (div * div <= num) {
			if (num % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
