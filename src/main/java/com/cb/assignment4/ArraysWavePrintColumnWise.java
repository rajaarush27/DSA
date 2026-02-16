package com.cb.assignment4;

import java.util.Scanner;

public class ArraysWavePrintColumnWise {
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
		int[] result = wavePrintColumnWise(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
		System.out.print("END");
		sc.close();
	}

	private static int[] wavePrintColumnWise(int[][] nums) {
		int row = nums.length;
		int col = nums[0].length;
		int totalElement = row * col;
		int[] result = new int[totalElement];
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < row; j++) {
					result[c++] = nums[j][i];
				}
			} else {
				for (int j = col - 1; j >= 0; j--) {
					result[c++] = nums[j][i];
				}
			}
		}
		return result;
	}

}
