package com.cb.assignment2;

import java.util.Scanner;

public class PrintArmstrongNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int count = getCount(n1);
		while (n1 < n2) {
			int sum = 0;
			int p = n1;
			while (p > 0) {
				int rem = p % 10;
				sum += Math.pow(rem, count);
				p /= 10;
			}
			if (sum == n1) {
				System.out.println(sum);
			}
			n1++;
		}
	}

	private static int getCount(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}
}
