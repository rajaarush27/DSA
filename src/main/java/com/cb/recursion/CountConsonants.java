package com.cb.recursion;

public class CountConsonants {

	public static void main(String[] args) {
         String str = "code";
         System.out.println(countCons(str, 0, 0));
	}
	
	private static int countCons(String str,int idx ,int count) {
		if(idx == str.length()) {
			return count;
		}
		if (str.charAt(idx) != 'a' && str.charAt(idx) != 'e' && str.charAt(idx) != 'i' && str.charAt(idx) != 'o'
				&& str.charAt(idx) != 'u') {
			count++;
		}
		return countCons(str,idx+1,count);
	}
}
