package com.cb.map;

import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {

	public static void main(String[] args) {
       int[] num = {0,3,7,2,5,8,4,6,0,1};
       System.out.println(longestSequence(num));
	}

	public static int longestSequence(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (!set.contains(x - 1)) {
				int c = 0;
				while (set.contains(x)) {
					set.remove(x);
					c++;
					x++;
				}
				ans = Math.max(ans, c);
			}
		}
		return ans;
	}
}
