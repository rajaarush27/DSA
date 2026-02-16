package com.cb.recursion;

public class CoinToss {

	public static void main(String[] args) {
		String ans = "";
		toss(3, ans);
		System.out.println();
		System.out.println();
		tossV1(4, ans);
	}

	private static void toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		toss(n - 1, ans + "T");
		toss(n - 1, ans + "H");
	}

	private static void tossV1(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H')
			tossV1(n - 1, ans + "H");

		tossV1(n - 1, ans + "T");
	}
}
