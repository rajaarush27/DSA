package com.cb.oops;

public class C {

	private int d = 2;
	private int d2 = 20;

	public void fun() {
		System.out.println("Fun in C");
	}

	public void fun1() {
		System.out.println("Fun1 in C");
	}

	public static int add(int... a) {
		return a.length;
	}
	
	public static int add(String... a) {
		return a.length;
	}
}
