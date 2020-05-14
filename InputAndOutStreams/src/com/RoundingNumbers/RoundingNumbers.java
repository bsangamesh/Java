package com.RoundingNumbers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RoundingNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// String file1 = reader.readLine();
		// String file2 = reader.readLine();

		reader.close();

		FileInputStream streamOne = new FileInputStream("D:/dev/inputStream/daaa.txt");
		// FileInputStream streamTwo = new FileInputStream(file2);

		byte[] fileOneContent = readFileContent(streamOne);
		// byte[] filetwoContent = readFileContent(streamTwo);

		FileOutputStream outputStream = new FileOutputStream("D:/dev/inputStream/result.txt");
		// outputStream.write(filetwoContent);
		for (int i = 0; i < fileOneContent.length; i++) {
			int data = (char)fileOneContent[i];

			//int output = (int) Math.round(data);
			System.out.println();
			outputStream.write(data);
		}
		// outputStream.write(fileOneContent);
		outputStream.close();

	}

	private static byte[] readFileContent(InputStream inputStream) throws IOException {
		byte[] buffer = new byte[inputStream.available()];
		while (inputStream.available() > 0) {
			System.out.println("inside");
			inputStream.read(buffer);
		}
		inputStream.close();
		return buffer;
	}

}
