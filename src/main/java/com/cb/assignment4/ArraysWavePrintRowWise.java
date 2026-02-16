package com.cb.assignment4;

import java.util.Scanner;

public class ArraysWavePrintRowWise {
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
		int[] result = wavePrintRowWise(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
		System.out.print("END");
		sc.close();
	}

	private static int[] wavePrintRowWise(int[][] nums) {
		int row = nums.length;
		int column = nums[0].length;
		int totalLength = row * column;
		int[] result = new int[totalLength];
		int count = 0;
		for (int i = 0; i < row; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < nums.length; j++) {
					result[count++] = nums[i][j];
				}
			} else {
				for (int j = nums.length - 1; j >= 0; j--) {
					result[count++] = nums[i][j];
				}
			}
		}
		return result;
	}

}
