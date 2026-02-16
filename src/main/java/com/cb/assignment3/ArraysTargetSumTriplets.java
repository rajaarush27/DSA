package com.cb.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumTriplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] nums = new int[t];
		for (int i = 0; i < t; i++) {
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		triplet(nums, target);
	}

	private static void triplet(int[] nums, int target) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
                     if(nums[i]+nums[j]+nums[k] == target) {
                    	 System.out.println(nums[i]+" ,"+nums[j]+" and "+nums[k]);
                     }
				} 
			}
		}
	}
}
