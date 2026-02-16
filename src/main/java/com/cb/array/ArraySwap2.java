package com.cb.array;

public class ArraySwap2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
