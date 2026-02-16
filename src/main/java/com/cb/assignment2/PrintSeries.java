package com.cb.assignment2;

public class PrintSeries {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 4;
		int i = 1;
		int j = 1;
		while (true) {
			int input = 3 * j + 2;
			int result = input % n2;
			if (result != 0) {
				System.out.println(input);
				if (i == n1) {
					break;
				}
				i++;
			}
			j++;
		}
	}
}
