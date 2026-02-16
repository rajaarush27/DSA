package com.cb.assignment1;

public class HollowDiamondPattern {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n / 2 + 1;
		int space = -1;

		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = row == 1 || row == n ? 2 : 1;
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			if (row < n / 2 + 1) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();
		}
	}
}
