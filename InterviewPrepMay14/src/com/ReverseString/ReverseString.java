package com.ReverseString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "This";
		
		String res = Arrays.asList(str.split(" ")).stream().map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
		//System.out.println(res);
		
		System.out.println(reverse(str));
	}

	
	private static String reverse(String str) {
		if(str.isEmpty()) {
			return "";
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
