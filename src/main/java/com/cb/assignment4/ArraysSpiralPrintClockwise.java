package com.cb.assignment4;

import java.util.Scanner;

public class ArraysSpiralPrintClockwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] nums = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		int[] result = spiralPrintClockWise(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
		System.out.print("END");
		sc.close();

	}

	private static int[] spiralPrintClockWise(int[][] nums) {
		int row = nums.length;
		int column = nums[0].length;
		int totalElement = row * column;
		int[] result = new int[totalElement];
		int minr = 0;
		int minc = 0;
		int maxr = row - 1;
		int maxc = column - 1;
		int c = 0;
		while (c < totalElement) {
			for (int i = minc; i <= maxc && c < totalElement; i++) {
				result[c++] = nums[minr][i];
			}
			minr++;
			for (int i = minr; i <= maxr && c < totalElement; i++) {
				result[c++] = nums[i][maxc];
			}
			maxc--;
			for (int i = maxc; i >= minc && c < totalElement; i--) {
				result[c++] = nums[maxr][i];
			}
			maxr--;
			for (int i = maxr; i >= minr && c < totalElement; i--) {
				result[c++] = nums[i][minc];
			}
			minc++;
		}
		return result;

	}
}
