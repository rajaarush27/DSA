package com.cb.slidingwindow;

/**
 * Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters.
 * Kartik Bhaiya describes perfectness of a string as the maximum length
 * substring of equal characters. Kartik Bhaiya is given a number k which
 * denotes the maximum number of characters he can change. Find the maximum
 * perfectness he can generate by changing no more than k characters.
 */
public class KartikBhaiyaAndStrings {

	public static void main(String[] args) {
		String s = "ababbababababaaabbabaa";
		int k = 2;
		int flip_a = maximumLength(s, k, 'a');
		int flip_b = maximumLength(s, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));
	}

	public static int maximumLength(String s, int k, char ch) {
		int si = 0, ei = 0, ans = 0, flip = 0;
		while (ei < s.length()) {

			if (s.charAt(ei) == ch) {
				flip++;
			}

			// window shrink
			while (flip > k && si <= ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}
