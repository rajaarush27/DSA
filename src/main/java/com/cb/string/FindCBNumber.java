package com.cb.string;

import java.util.Scanner;

public class FindCBNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "";
		for (int i = 0; i < n; i++) {
			str += sc.next();
		}
		subString(str);
	}

	private static void subString(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int length = 1; length <= str.length(); length++) {
			for (int j = length; j <= str.length(); j++) {
				int i = j - length;
				long num = Long.parseLong(str.substring(i, j));
				if (isCbNumber(num) && isVisited(visited, i, j - 1)) {
					count++;
					// marked visited
					for (int k = i; k < j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static boolean isVisited(boolean[] visited, int i, int j) {
		while (i <= j) {
			if (visited[i]) {
				return false;
			}
			j++;
		}
		return true;
	}

	private static boolean isCbNumber(long num) {
		if (num <= 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			} else if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
