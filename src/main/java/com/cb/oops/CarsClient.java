package com.cb.oops;

import java.util.Arrays;
import java.util.Comparator;

public class CarsClient {
	public static void main(String[] args) {
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
		Arrays.sort(arr, new Comparator<Cars>() {
			@Override
			public int compare(Cars o1, Cars o2) {
				return o1.getPrice() - o2.getPrice();
			}

		});

		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice());
		Arrays.sort(arr, (a, b) -> b.getSpeed() - a.getSpeed());
		display(arr);
	}

	public static <T> void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	@SuppressWarnings("unused")
	private static <T extends Comparable<T>> void bubbleSort(T[] nums) {
		for (int turn = 1; turn < nums.length; turn++) {
			for (int i = 0; i < nums.length - turn; i++) {
				if (nums[i].compareTo(nums[i + 1]) > 0) {
					T temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
	}
}
