package com.cb.assignment2;

import java.util.Scanner;

public class ConversionFahrenheittoCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minFar = sc.nextInt();
		int maxFar = sc.nextInt();
		int step = sc.nextInt();

		for (int i = minFar; i <= maxFar; i += step) {
			int result = (int) (5.0 / 9 * (i - 32));
			System.out.println(i + " " + result);
		}
	}
}
