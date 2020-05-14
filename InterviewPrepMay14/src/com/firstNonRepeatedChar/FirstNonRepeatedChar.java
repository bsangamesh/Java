package com.firstNonRepeatedChar;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "teeter";

		for (char i : input.toCharArray()) {
			if (input.indexOf(i) == input.lastIndexOf(i)) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		System.out.println("rea : " + logic(input));
	}

	//Using Java 8 Stream
	private static Character logic(String input) {
		Character result = input.chars() // string stream
				.mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();

		return result;
	}
}
