package com.copyContentInReverse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyContentInReverse {

	public static void main(String[] args) throws IOException {
		System.out.println("maaa");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String fileName = read.readLine();
		String out = read.readLine();
		
		FileInputStream input = new FileInputStream(fileName);
		FileOutputStream ouput = new FileOutputStream(out);
		byte[] data = new byte[input.available()];
		int j = 0;
		while (input.available() > 0) {
			data[j++] = (byte) input.read();
		}
		for (int i = data.length - 1; i >= 0; i--) {
			ouput.write(data[i]);
		}

		input.close();
		ouput.close();
	}

}
