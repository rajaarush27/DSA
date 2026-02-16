package com.cb.recursion;

public class CountBoardPath {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(print(n, 0, ""));
	}

	private static int print(int n, int curr, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return 1;
		}
		int d = 0;
		for (int dice = 1; dice <= 3; dice++) {
			if (curr > n) {
				return 0;
			} else {
				d = d + print(n, curr + dice, ans + dice);
			}
		}
		return d;
	}

}
