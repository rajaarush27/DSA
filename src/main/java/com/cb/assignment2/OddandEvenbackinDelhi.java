package com.cb.assignment2;

import java.util.Scanner;

public class OddandEvenbackinDelhi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		eligible(num);
	}

	private static void eligible(int[] nums) {
		for (int c1 : nums) {
			int evenSum = 0;
			int oddSum = 0;
			int count = 0;
			while (c1 > 0) {
				count++;
				if (count % 2 == 0) {
					int evenRem = c1 % 10;
					evenSum += evenRem;
				} else {
					int oddRem = c1 % 10;
					oddSum += oddRem;
				}
				c1 /= 10;
			}
			if (evenSum % 4 == 0 || oddSum % 3 == 0) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

	}
}
