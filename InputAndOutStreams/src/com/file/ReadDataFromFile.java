package com.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromFile {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String fileName = read.readLine();
		FileInputStream inputStream = new FileInputStream(fileName);

		int code = 44, count = 0;

		while (inputStream.available() > 0) {
			int temp = inputStream.read();
			if (temp == code) {
				count++;
			}
		}

		System.out.println(count);

		inputStream.close();

	}
}
