package com.cb.assignment4;

import java.util.Scanner;

public class ArraysSpiralPrintAnticlockwise {
	public static void main(String[] args) {
		
		int[][]arr ={ {10,11,12,13},
				      {21,22,23,24},
				      {31,32,33,34},
				      {41,42,43,44}
				     };

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] nums = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		int[] result = print(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
		System.out.print("END");
		sc.close();
	}

	private static int[] print(int[][] nums) {
		int row = nums.length;
		int col = nums[0].length;
		int totalElement = row * col;
		int[] result = new int[totalElement];
		int minr = 0;
		int maxr = row - 1;
		int minc = 0;
		int maxc = col - 1;
		int c = 0;
		while (c < totalElement) {
			for (int i = minc; i <= maxr && c < totalElement; i++) {
				result[c++] = nums[i][minc];
			}
			minc++;
			for (int i = minc; i <= maxc && c < totalElement; i++) {
				result[c++] = nums[maxc][i];
			}
			maxr--;
			for (int i = maxr; i >= minr && c < totalElement; i--) {
				result[c++] = nums[i][maxc];
			}
			maxc--;
			for (int i = maxc; i >= minc && c < totalElement; i--) {
				result[c++] = nums[minr][i];
			}
			minr++;
		}
		return result;

	}
}
