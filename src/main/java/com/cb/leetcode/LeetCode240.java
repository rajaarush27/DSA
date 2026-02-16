package com.cb.leetcode;

public class LeetCode240 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 5;
		System.out.println(findTargetElement(matrix, target));
		System.out.println(findTargetElementV2(matrix, target));
	}

	// Time Complexity O(n^2)
	private static boolean findTargetElement(int[][] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean findTargetElementV2(int[][] matrix, int target) {
		int row = 0;
		int column = matrix[0].length - 1;

		while (row < matrix.length && column >= 0) {
			if (matrix[row][column] == target) {
				return true;
			} else if (matrix[row][column] > target) {
				column--;
			} else {
				row++;
			}
		}
		return false;
	}
}
