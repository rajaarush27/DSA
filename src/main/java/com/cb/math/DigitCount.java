package com.cb.math;

public class DigitCount {

	public static int getDigitCount(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}
}
