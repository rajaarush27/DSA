package com.cb.recursion;

public class MazePath {
	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		path(0, 0, m - 1, n - 1, "");
	}

	private static void path(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		path(cr + 1, cc, er, ec, ans + "V");
		path(cr, cc + 1, er, ec, ans + "H");
	}
}
