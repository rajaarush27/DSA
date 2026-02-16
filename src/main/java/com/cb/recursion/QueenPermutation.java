package com.cb.recursion;

public class QueenPermutation {
	public static void main(String[] args) {
		int n = 4;
		int tq = 2;
		int[] board = new int[n];

		permutation(board, tq, 0, "");
	}

	private static void permutation(int[] board, int tq, int qpsf, String ans) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 0) {
				board[i] = 1;
				permutation(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
				board[i] = 0;
			}
		}
	}
}
