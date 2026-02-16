package com.cb.math;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isArmstrong(n));
	}

	private static boolean isArmstrong(int num) {
		int original = num;
		int count = DigitCount.getDigitCount(num);
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += Math.pow(rem, count);
			num /= 10;
		}
		return original == sum;
	}
}
