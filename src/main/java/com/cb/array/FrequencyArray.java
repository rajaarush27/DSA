package com.cb.array;

public class FrequencyArray {

	public static void main(String[] args) {
		String s = "codingblocks";
		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 97]++;
		}
	}
}
