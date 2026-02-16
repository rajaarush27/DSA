package com.cb.assignment1;

public class PatternDoubleSidedArrow {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int star = 1;
		int space = n - 1;
		int space2 = -1;
		int val = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				j++;
				p--;
			}
			int k = 1;
			while (k <= space2) {
				System.out.print("  ");
				k++;
			}

			int l = 1;
			if (row == 1 || row == n) {
				l = 2;
			}
			while (l <= star) {
				System.out.print(l + " ");
				l++;
			}
			if (row < n / 2 + 1) {
				star++;
				space -= 2;
				space2 += 2;
				val++;
			} else {
				star--;
				space += 2;
				space2 -= 2;
				val--;
			}
			row++;
			System.out.println();
		}
	}
}
