package com.cb.assignment3;

import java.util.Scanner;

public class HelpRamu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		int c4 = sc.nextInt();

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[] cab = new int[m];
		int[] rikshaw = new int[n];

		for (int i = 0; i < m; i++) {
			cab[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			rikshaw[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(minumumCost(rikshaw, cab, c1, c2, c3, c4));
	}

	private static int minumumCost(int[] rikshaw, int[] cab, int c1, int c2, int c3, int c4) {
		int rikshawCost = 0;

		for (int i = 0; i < rikshaw.length; i++) {
			rikshawCost += Math.max(rikshaw[i] * c1, c2);
		}
		rikshawCost = Math.min(rikshawCost, c3);
		int cabCost = 0;
		for (int i = 0; i < cab.length; i++) {
			cabCost += Math.min(cab[i] * c1, c2);
		}
		cabCost = Math.min(cabCost, c3);
		return Math.min(rikshawCost + cabCost, c4);

	}
}
