package com.mostFrequent;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class FindFrequFIle {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String fileName = read.readLine();
		FileInputStream input = new FileInputStream(fileName);
		int max = Integer.MAX_VALUE;
		Set<Byte> set = new TreeSet<Byte>();
		HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();

		while (input.available() > 0) {
			byte temp = (byte) input.read();
			set.add(temp);
			if (map.containsKey(temp)) {
				int tem = map.get(temp);
				map.put(temp, ++tem);
			} else {
				map.put(temp, 1);
			}
		}
		for (Byte val : set) {
			System.out.print(val + " ");
		}

		input.close();
	}

}
