package com.cb.recursion;

public class SumofArrayElements {

	public static void main(String[] args) {
         int[] arr = {1,3,2};
         System.out.println(sumNum(arr, 0, 0));
	}

	private static int sumNum(int[] arr, int sum, int idx) {
		if (idx == arr.length) {
			return sum;
		}
		sum += arr[idx];
		return sumNum(arr, sum, idx + 1);
	}

}
