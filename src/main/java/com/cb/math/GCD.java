package com.cb.math;

public class GCD {
	public static void main(String[] args) {
         int a = 60;
         int b = 36;
         while(a % b != 0) {
        	 int rem = a % b;
        	 a = b;
        	 b = rem;
         }
         System.out.println(b);
	}
}
