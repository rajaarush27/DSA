package com.cb.devideAndConcur;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 2, 1, 8, 3, 4 };
		int[] result = sort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(result));

	}

	private static int[] sort(int[] nums, int si, int ei) {
		if (si == ei) {
			int[] bs = { nums[si] };
			return bs;

		}
		int mid = (si + ei) / 2;
		int[] f = sort(nums, si, mid);
		int[] s = sort(nums, mid + 1, ei);
		return merge(f, s);
	}

	private static int[] merge(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;

		int[] result = new int[n1 + n2];
		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {
			if (nums1[i] <= nums2[j]) {
				result[k++] = nums1[i++];
			} else {
				result[k++] = nums2[j++];
			}
		}

		while (i < n1) {
			result[k++] = nums1[i++];
		}
		while (j < n2) {
			result[k++] = nums2[j++];
		}

		return result;
	}

}
