package com.cb.recursion;

public class PrintArrayElement {

	public static void main(String[] args) {
         int[]arr = {1,2,3};
         int idx = 0;
         print(arr, idx);
	}

	private static void print(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.print(arr[idx]+" ");
		print(arr, idx + 1);
	}
}
