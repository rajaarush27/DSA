package com.cb.dp;

public class FabonacciSeries {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fibonacci(n));
		System.out.println(fibonacciUsingDpTopDown(n, new int[n + 1]));
	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f1 = fibonacci(n - 1);
		int f2 = fibonacci(n - 2);
		return f1 + f2;
	}

	public static int fibonacciUsingDpTopDown(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		int f1 = fibonacciUsingDpTopDown(n - 1, dp);
		int f2 = fibonacciUsingDpTopDown(n - 2, dp);
		return dp[n] = f1 + f2;
	}

	public static int fibonacciUsingDpBottomUp(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[dp.length - 1];
	}
}
