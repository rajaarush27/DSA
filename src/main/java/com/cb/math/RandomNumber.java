package com.cb.math;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int si = 0;
		int ei = 9;
		Random rm = new Random();

		for (int i = 0; i < 6; i++) {
			int x = rm.nextInt(ei - si + 1) + si;
			System.out.print(x);
		}
	}

}
