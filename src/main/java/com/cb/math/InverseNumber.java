package com.cb.math;

import java.util.Scanner;

public class InverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int place = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += place * Math.pow(10, rem - 1);
			n /= 10;
			place++;
		}
		System.out.println(sum);
	}
}
