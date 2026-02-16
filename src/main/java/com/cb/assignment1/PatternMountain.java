package com.cb.assignment1;

public class PatternMountain {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		int space = 2 * n - 3;
		while (row <= n) {
			int i = 1;
			int val = 1;
			while (i <= star) {
				System.out.print(val + "\t");
				i++;
				val++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}
			int k = row == n ? 2 : 1;
			int p = row == n ? n - 1 : row;
			while (k <= star) {
				System.out.print(p + "\t");
				if (p < n / 2 - 1) {
					p++;
				} else {
					p--;
				}
				k++;
			}
			star++;
			space -= 2;
			row++;
			System.out.println();
		}
	}
}
