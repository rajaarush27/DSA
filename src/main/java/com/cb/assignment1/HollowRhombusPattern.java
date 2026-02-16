package com.cb.assignment1;

public class HollowRhombusPattern {
	public static void main(String[] args) {
		int n = 5;
		int space = n-1;
		int star = 5;
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				if (row == 1 || row == n) {
					System.out.print("*");
				} else {
					if (j == 1 || j == star) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				j++;
			}
			space--;
			row++;
			System.out.println();
		}
	}
}
