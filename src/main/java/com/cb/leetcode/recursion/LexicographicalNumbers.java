package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
	public static void main(String[] args) {
		int n = 13;
		List<Integer> list = new ArrayList<>();
		lexicographical(0, n, list);
		System.out.println(list);
	}

	private static void lexicographical(int curr, int n, List<Integer> list) {
		if (curr > n) {
			return;
		}
		if (curr != 0)
			list.add(curr);
		int i = curr == 0 ? 1 : 0;
		for (; i <= 9; i++) {
			lexicographical(curr * 10 + i, n, list);
		}
	}

}
