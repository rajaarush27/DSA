package com.cb.assignment3;

import java.util.Scanner;

public class VonNeumanLovesBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		vonNeumanLovesBinary(nums);
	}

	private static void vonNeumanLovesBinary(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int result = convertBinaryToDecimal(nums[i]);
			System.out.println(result);
		}
	}

	private static int convertBinaryToDecimal(int num) {
		int mul = 1;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem * mul;
			mul = mul * 2;
			num = num / 10;
		}
		return sum;
	}

}
