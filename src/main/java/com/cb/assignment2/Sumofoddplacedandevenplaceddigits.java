package com.cb.assignment2;

public class Sumofoddplacedandevenplaceddigits {
	public static void main(String[] args) {
		int num = 2635;
		int i = 1;
		int oddSum = 0;
		int evenSum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (i % 2 == 0) {
				oddSum += rem;
			} else {
				evenSum += rem;
			}
			i++;
			num /= 10;
		}
		System.out.println("Even Sum " + evenSum);
		System.out.println("Odd Sum " + oddSum);
	}
}
