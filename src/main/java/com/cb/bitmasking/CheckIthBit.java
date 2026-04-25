package com.cb.bitmasking;

public class CheckIthBit {

	public static void main(String[] args) {
		int n = 84;
		int i = 3;
		int mask = (1 << i);
		if ((n & mask) == 0) {
			System.out.println("Un set bit");
		} else {
			System.out.println("Set bit");
		}
	}
}
