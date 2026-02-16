package com.cb.assignment4;

import java.util.Scanner;

public class MatrixSearch {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int k = scn.nextInt();
		System.out.print(searchMatrix(arr, k));
		scn.close();
		int[][] nums = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
	}

	private static int searchMatrix(int[][] arr, int k) {
		int row = 0;
		int column = arr[0].length - 1;
		while (row < arr.length && column >= 0) {
			if (arr[row][column] == k) {
				return 1;
			} else if (arr[row][column] > k) {
				column--;
			} else {
				row++;
			}
		}
		return 0;
	}
}
