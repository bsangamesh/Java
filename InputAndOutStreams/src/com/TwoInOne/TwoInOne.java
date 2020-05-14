package com.TwoInOne;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoInOne {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		FileInputStream file2 = new FileInputStream(read.readLine());
		FileInputStream file3 = new FileInputStream(read.readLine());
		FileOutputStream file1 = new FileOutputStream(read.readLine());
		byte[] data;
		data = new byte[file2.available()];
		file2.read(data, 0, file2.available());
		file1.write(data);
		file2.close();
		data = new byte[file3.available()];
		file3.read(data, 0, file3.available());
		file1.write(data);
		file1.close();
		file3.close();
	}

}
