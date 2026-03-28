package com.cb.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode350 {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 2, 1 }, num2 = { 2, 2 };
		int[] result = intersactionOfTwoArrayts(num1, num2);
		System.out.println(Arrays.toString(result));
	}

	public static int[] intersactionOfTwoArrayts(int[] num1, int... nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < num1.length; i++) {
			if (map.containsKey(num1[i])) {
				map.put(num1[i], map.get(num1[i]) + 1);
			} else {
				map.put(num1[i], 1);
			}
		}
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				ll.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		int[] arr = ll.stream().mapToInt(Integer::intValue).toArray();
		return arr;
	}
}
