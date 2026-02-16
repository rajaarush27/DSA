package com.cb.assignment1;

public class PatternNumberLadder {
	public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int star =1;
        int val = 1;
        while(row <= n) {
        	int i = 1;
        	while(i <= star) {
        		System.out.print(val+" ");
        		i++;
        		val++;
        	}
        	star++;
        	row++;
        	System.out.println();
        }
	}
}
