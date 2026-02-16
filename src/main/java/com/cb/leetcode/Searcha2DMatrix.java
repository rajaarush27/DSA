package com.cb.leetcode;

public class Searcha2DMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		System.out.println(search(matrix, target));
	}

	private static boolean search(int[][] matrix, int target) {
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
