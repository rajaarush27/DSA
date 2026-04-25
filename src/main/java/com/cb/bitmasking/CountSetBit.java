package com.cb.bitmasking;

public class CountSetBit {

	public static void main(String[] args) {
		int n = 78;
		System.out.println(countBit(n));
	}

	private static int countBit(int num) {
		int c = 0;
		while (num > 0) {
			if ((num & 1) == 1) {
				c++;
			}
			num >>= 1;
		}
		return c;
	}
	
	private static int fastCountBit(int num) {
		int c = 0;
		while (num > 0) {
			
			num >>= 1;
		}
		return c;
	}
}
