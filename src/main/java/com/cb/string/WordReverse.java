package com.cb.string;

public class WordReverse {

	public static void main(String[] args) {
         reverseTheWord("a good   example");
	}

	private static void reverseTheWord(String str) {
		str = str.trim();
		String[] s = str.split(" +");
		StringBuilder result = new StringBuilder();
		for(int i = s.length-1 ; i >= 0 ; i--) {
			result.append(s[i]);
			if(i !=0) {
				result.append(" ");
			}
		}
		System.out.println(result);
	}
}
