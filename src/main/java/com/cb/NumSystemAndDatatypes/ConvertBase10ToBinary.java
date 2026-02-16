package com.cb.NumSystemAndDatatypes;

public class ConvertBase10ToBinary {
	public static void main(String[] args) {
		int num = 76;
		int sum = 0;
		int mul = 1;
		while (num > 0) {
			int rem = num % 2;
			sum = sum + rem * mul;
			mul *= 10;
			num = num / 2;
		}
      System.out.println(sum);
	}
}
