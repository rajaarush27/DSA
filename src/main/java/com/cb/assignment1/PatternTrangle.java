package com.cb.assignment1;

public class PatternTrangle {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n-1;
		int val = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			int k = val;
			while (j <= star) {
				System.out.print(k + "\t");
				if (j < val) {
					k++;
				} else {
					k--;
				}
				j++;
			}
			star += 2;
			space--;
			row++;
			val++;
			System.out.println();
		}
	}
}
