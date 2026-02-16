package com.cb.assignment1;

public class PascalTriangle {
	public static void main(String[] args) {
		int n = 6;
		int row = 0;
		int star = 1;
		while (row < n) {
			int i = 0;
			int ncr = 1;
			while (i < star) {
				System.out.print(ncr + "\t");
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			star++;
			row++;
			System.out.println();
		}
	}
}
