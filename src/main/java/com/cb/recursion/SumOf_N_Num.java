package com.cb.recursion;

public class SumOf_N_Num {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(sum(n));

	}

	private static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		int s = sum(n - 1);
		return n + s;
	}

}
