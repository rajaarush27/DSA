package com.cb.recursion;

public class QueenCombination {
	public static void main(String[] args) {
		int n = 4;
		int tq = 2;
		int[] board = new int[n];

		combination(board, tq, 0, "", 0);
	}

	private static void combination(int[] board, int tq, int qpsf, String ans, int idx) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == 0) {
				board[i] = 1;
				combination(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf, i + 1);
				board[i] = 0;
			}
		}
	}
}
