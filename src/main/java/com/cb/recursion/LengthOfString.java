package com.cb.recursion;

public class LengthOfString {

	public static void main(String[] args) {
      String str = "Aarush";
      System.out.println(countLength(str, 0, 0));
	}

	private static int countLength(String str, int idx, int count) {
		if (idx == str.length()) {
			return count;
		}
		count++;
		return countLength(str, idx + 1, count);
	}
}
