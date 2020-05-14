package com.stringPermu;

public class StringPermu {

	public static boolean isPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}
		int last = s.length() - 1;
		System.out.println(last / 2);
		for (int i = 0; i <= last / 2; i++) {
			if (s.charAt(i) != s.charAt(last - i)) {
				return false;
			}
		}
		return true;
	}

	static void printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermutn(ros, ans + ch);
		}
	}

	// Driver code
	public static void main(String[] args) {
		String s = "abba";
		System.out.println(isPalindrome(s));
	}
}
