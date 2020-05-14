package com.CombiningFiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CombiningFiles {
	//"D:/dev/inputStream/daaa.txt"
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String file1 = reader.readLine();
		String file2 = reader.readLine();

		reader.close();

		FileInputStream streamOne = new FileInputStream(file1);
		FileInputStream streamTwo = new FileInputStream(file2);

		byte[] fileOneContent = readFileContent(streamOne);
		byte[] filetwoContent = readFileContent(streamTwo);

		FileOutputStream outputStream = new FileOutputStream(file1);
		outputStream.write(filetwoContent);
		outputStream.write(fileOneContent);
		outputStream.close();

	}

	private static byte[] readFileContent(InputStream inputStream) throws IOException {
		byte[] buffer = new byte[inputStream.available()];
		while (inputStream.available() > 0) {
			inputStream.read(buffer);
		}
		inputStream.close();
		return buffer;
	}

}
