package com.cb.dp;

public class KnapSackZeroOne {

	public static void main(String[] args) {

	}

	private static int knapsack(int[]weight,int[]value,int cap,int i,int[][]dp) {
		if(cap == 0 || i == weight.length) {
			return 0;
		}
		
		
		int inc = 0 , exc = 0;
		if(cap >= weight[i]) {
			inc = value[i] +knapsack(weight, value, cap-weight[i], i+1,dp);
		}
		exc = knapsack(weight, value, cap, i+1,dp);
		return Math.max(inc, exc);
	}
}
