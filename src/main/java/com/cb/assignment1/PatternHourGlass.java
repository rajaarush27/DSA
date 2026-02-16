package com.cb.assignment1;

public class PatternHourGlass {
	public static void main(String[] args) {
		int n = 5;
		int star = 2 * n + 1;
		int space = 0;
		int row = 1;
		int val = n;
		while (row <= 2 * n + 1) {
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			int p = val;
			while (i <= star) {
				System.out.print(p + " ");
				if (i < star / 2 + 1) {
					p--;
				} else {
					p++;
				}
				i++;
			}
			if (row < n + 1) {
				star -= 2;
				space++;
				val--;
			} else {
				star += 2;
				space--;
				val++;
			}
			row++;
			System.out.println();
		}
	}
}
