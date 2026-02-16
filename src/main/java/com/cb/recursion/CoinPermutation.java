package com.cb.recursion;

public class CoinPermutation {
	public static void main(String[] args) {
		int[] coins = { 2, 3, 5 };
		int amount = 7;
		String ans = "";
		permutation(coins, amount, ans);
	}

	private static void permutation(int[] coins, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			if (amount >= coins[i]) {
				permutation(coins, amount - coins[i], ans + coins[i]);
			}
		}
	}
}
