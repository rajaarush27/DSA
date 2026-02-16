package com.cb.assignment1;

public class PatternInvertedHourGlass {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		int space = 2 * n - 1;
		int val2 = n;
		while (row <= 2 * n + 1) {
			int val = n;
			int i = 1;
			while (i <= star) {
				System.out.print(val + " ");
				i++;
				val--;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			int k = 1;
			if (row == n + 1) {
				k = 2;
			}
			int p = val2;
			if (row == n + 1) {
				p = 1;
			}
			while (k <= star) {
				System.out.print(p + " ");
				p++;
				k++;
			}
			if (row < n + 1) {
				star++;
				space -= 2;
				val2--;
			} else {
				star--;
				space += 2;
				val2++;
			}
			row++;
			System.out.println();
		}
	}
}
