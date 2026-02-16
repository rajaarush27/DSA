package com.cb.assignment1;

public class PatternWithZeros {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int star = 1;
		int val = 1;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				if (row == 1 || row == 2) {
					System.out.print(val + " ");
				} else if (row > 2 && (i == 1 || i == row)) {
					System.out.print(val + " ");
				} else {
					System.out.print(0 + " ");
				}
				i++;
			}
			val++;
			row++;
			star++;
			System.out.println();
		}
	}
}
