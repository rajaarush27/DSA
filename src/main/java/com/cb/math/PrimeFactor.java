package com.cb.math;

public class PrimeFactor {
	public static void main(String[] args) {
		int num = 378;
		int i = 2;
		while (num > 1) {
			if (num % i == 0) {
				System.out.println(i);
				num = num / i;
			} else {
				i++;
			}
		}
	}
}
