package com.cb.assignment5;

public class Strings_StringCompression {

	public static void main(String[] args) {
         compress("aaabbccds");
  
	}

	private static void compress(String str) {
		String result = "";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				if (count > 1)
					result = result + str.charAt(i) + count;
				else
					result = result + str.charAt(i);
				count = 1;
			}
		}
		System.out.println(result);
	}
}
