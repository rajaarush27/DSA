package com.cb.array.binarysearch;

import java.util.*;

public class AggressiveCows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int nos = sc.nextInt();
			int noc = sc.nextInt();
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(largestMinimumDistance(stall, noc));
		}
	}

	private static int largestMinimumDistance(int[] stall, int noc) {
		int left = 1;
		int right = stall[stall.length - 1] - stall[0];
		int ans = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (isItPossible(stall, noc, mid)) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;
	}

	private static boolean isItPossible(int[] stall, int cows, int mid) {
		int cow = 1;
		int position = stall[0];

		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - position >= mid) {
				cow++;
				position = stall[i];
			}
			if (cow == cows) {
				return true;
			}
		}
		return false;
	}
}
