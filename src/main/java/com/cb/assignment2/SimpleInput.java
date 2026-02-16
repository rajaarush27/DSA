package com.cb.assignment2;

import java.util.Scanner;

public class SimpleInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

	}

	private static void getResult(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				System.out.println(num[i]);
			} else {
				break;
			}
		}
	}
}
