package com.cb.assignment1;

public class FibonacciPattern {
	public static void main(String[] args) {
		int n = 4;
		int row = 1;
		int star = 1;
		int a = 0;
		int b = 1;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				if (row == 1) {
					System.out.print(a + " ");
				} else if (row == 2 && i == 1) {
					System.out.print(b + " ");
				} else {
					int c = a + b;
					a = b;
					b = c;
					System.out.print(c + " ");

				}
				i++;
			}
			star++;
			row++;
			System.out.println();
		}
	}
}
