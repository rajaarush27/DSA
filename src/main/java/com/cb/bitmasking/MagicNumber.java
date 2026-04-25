package com.cb.bitmasking;

public class MagicNumber {

	public static void main(String[] args) {
       int n = 5;
       System.out.println(number(n));
       System.out.println(numberGeneric(n, 5));
	}
	
	public static int number(int n) {
		int mul = 5;
		int ans = 0;
		while(n > 0) {
			if((n & 1) == 1) {
				ans  = ans + mul;
			}
			mul = mul * 5;
			n >>= 1;
		}
		return ans;
	}
	
	public static int numberGeneric(int n,int x) {
//		int mul = 5;
		int ans = 0;
		while(n > 0) {
			if((n & 1) == 1) {
				ans  = ans + x;
			}
			x = x * x;
			n >>= 1;
		}
		return ans;
	}
}
