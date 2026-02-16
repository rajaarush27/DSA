package com.cb.recursion;

public class CoinCombination {
	public static void main(String[] args) {
		int[] coins = { 2, 3, 5 };
		int amount = 7;
		String ans = "";
		comibination(coins, amount, ans,0);
	}

	private static void comibination(int[] coins, int amount, String ans,int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coins.length; i++) {
			if (amount >= coins[i]) {
				comibination(coins, amount - coins[i], ans + coins[i],i);
			}
		}
	}
}
