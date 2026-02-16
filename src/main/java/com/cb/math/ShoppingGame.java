package com.cb.math;

import java.util.Scanner;

public class ShoppingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			winner(m, n);
		}
	}

	public static void winner(int m, int n) {
		int ayush = 0;
		int harshit = 0;
		int phone = 1;

		while (true) {
			ayush = ayush + phone;
			if (ayush > m) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			harshit = harshit + phone;
			if (harshit > n) {
				System.out.println("Aayush");
				break;
			}
			phone++;
		}
	}

}
