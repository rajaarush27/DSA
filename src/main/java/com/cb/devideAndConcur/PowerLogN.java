package com.cb.devideAndConcur;

public class PowerLogN {

	public static void main(String[] args) {
		int a = 3;
		int n = 5;
		System.out.println(pow(a, n));
	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}

		int half = pow(a, b / 2);
		half *= half;
		if (b % 2 != 0) {
			half *= a;
		}
		return half;
	}
}
