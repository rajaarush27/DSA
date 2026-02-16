package com.cb.array;

public class ArraySwap3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 100, 200, 300, 400, 500 };
		System.out.println(arr[0] + " " + arr2[0]);
        swap(arr, arr2);
		System.out.println(arr[0] + " " + arr2[0]);
	}
	
	private static void swap(int[] arr,int[]other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}
}
