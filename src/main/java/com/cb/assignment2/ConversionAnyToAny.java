package com.cb.assignment2;

import java.util.Scanner;

public class ConversionAnyToAny {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int src = sc.nextInt();
		int dest = sc.nextInt();
		int num = sc.nextInt();
		int mul = 1;
		int sum = 0;
		while (num > 0) {
			int rem = num % dest;
			sum = sum + rem * mul;
			mul = mul * src;
			num = num / dest;
		}
		System.out.println(sum);
	}
}
