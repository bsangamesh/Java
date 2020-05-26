package com.sortObjects;

import java.util.Arrays;
import java.util.Optional;

public class MainClass {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);

		// Arrays.sort(empArr);
		// Arrays.sort(empArr, new EmployeeComparatorByIdAndName());
		// System.out.println("Sorted --> : " + Arrays.toString(empArr));

		String[] words = new String[10];
		Optional<String> option = Optional.ofNullable(words[5]);
		if (option.isPresent()) {
			System.out.println(words[5].toLowerCase());
		} else {
			System.out.println("String is null");
		}
	}
}
