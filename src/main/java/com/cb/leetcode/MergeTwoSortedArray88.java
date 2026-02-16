package com.cb.leetcode;

import java.util.Arrays;

public class MergeTwoSortedArray88 {
	public static void main(String[] args) {
          int[] nums1 = {1,3,5,7};
          int[] nums2 = {2,3,4,5,11,13};
          merge(nums1, nums2);
	}
	
	private static void merge(int[]nums1,int[]nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		
		int[] result = new int[n1+n2];
		int i = 0 , j = 0 , k =0;
		
		while(i < n1 && j < n2) {
			if(nums1[i] <= nums2[j]) {
				result[k++] = nums1[i++];
			}else {
				result[k++] = nums2[j++];
			}
		}
		
		while(i < n1) {
			result[k++] = nums1[i++];
		}
		while(j < n2) {
			result[k++] = nums2[j++];
		}
		
		System.out.println(Arrays.toString(result));
	}
}
