package com.cb.recursion;

public class CountCoinToss {

	public static void main(String[] args) {
		String ans = "";
		System.out.println(toss(3, ans));
		System.out.println();
		System.out.println();
		System.out.println(tossV1(3, ans));
	}

	private static int toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		int t = toss(n - 1, ans + "T");
		int h = toss(n - 1, ans + "H");
		return t + h;
	}

	private static int tossV1(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		int h = 0;
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H')
			h = h + tossV1(n - 1, ans + "H");

		int t = tossV1(n - 1, ans + "T");
		return h + t;
	}
}
