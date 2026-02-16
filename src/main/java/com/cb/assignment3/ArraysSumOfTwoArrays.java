package com.cb.assignment3;

import java.util.ArrayList;
import java.util.List;

public class ArraysSumOfTwoArrays {

	public static void main(String[] args) {

	}

	private static void addTwoNumber(int[] nums1, int[] nums2) {
		List<Integer> result = new ArrayList<>();
		int carry = 0;
		int i = nums1.length - 1;
		int j = nums2.length - 1;

		while (i >= 0 && j >= 0) {
			int sum = carry + nums1[i] + nums2[j];
			result.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		while (i >= 0) {
			int sum = carry + nums1[i];
			result.add(sum % 10);
			carry = sum / 10;
			i--;
		}
		while (j >= 0) {
			int sum = carry + nums1[j];
			result.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry != 0) {
			result.add(carry);
		}
		for (int k = result.size() - 1; k >= 0; k--) {
			System.out.print(result.get(k) + ", ");
		}
		System.out.println("END");
	}
}
