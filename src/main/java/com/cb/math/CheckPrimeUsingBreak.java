package com.cb.math;

import java.util.Scanner;

public class CheckPrimeUsingBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				fact++;
				break;
			}
		}
		if (fact >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}
}
