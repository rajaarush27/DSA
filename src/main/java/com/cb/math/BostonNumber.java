package com.cb.math;

import java.util.Scanner;

public class BostonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(bostonNumber(n));
	}

	public static boolean bostonNumber(int num) {
		int sum = 0;
		int i = 2;
		int p = num;
		while (num > 1) {
			if (num % i == 0) {
				sum += sumOfDigit(i);
				num = num / i;
			} else {
				i++;
			}
		}
		int sum1 = sumOfDigit(p);
		if (sum == sum1) {
			return true;
		} else {
			return false;
		}
	}

	public static int sumOfDigit(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}
}
