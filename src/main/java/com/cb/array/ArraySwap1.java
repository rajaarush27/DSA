package com.cb.array;

public class ArraySwap1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; // heap (Internally work same as new int[]{})
//		int[] arr1 = new int[] { 1, 2, 3, 4, 5 }; // heap
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}

	private static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
}
