package com.cb.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
	public static void main(String[] args) {
		int n = 3;
		parantheses(n, "", 0, 0);
		List<String> ll = new ArrayList<>();
		paranthesesV1(n, "", 0, 0, ll);
		System.out.println(ll);
	}

	private static void parantheses(int n, String ans, int open, int closed) {
		if (open == n && closed == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}
		parantheses(n, ans + "(", open + 1, closed);
		parantheses(n, ans + ")", open, closed + 1);
	}

	private static void paranthesesV1(int n, String ans, int open, int closed, List<String> list) {
		if (open == n && closed == n) {
			list.add(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}
		paranthesesV1(n, ans + "(", open + 1, closed, list);
		paranthesesV1(n, ans + ")", open, closed + 1, list);
	}
}
