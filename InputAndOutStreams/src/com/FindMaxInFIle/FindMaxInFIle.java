package com.FindMaxInFIle;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMaxInFIle {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String fileName = read.readLine();
		FileInputStream input = new FileInputStream(fileName);
		int max = Integer.MAX_VALUE;

		while (input.available() > 0) {
			int temp = (char) input.read();
			//System.out.println("temp: " + temp);
			if (temp < max) {
				max = temp;
			}
		}

		System.out.println(max);
		input.close();
	}

}
