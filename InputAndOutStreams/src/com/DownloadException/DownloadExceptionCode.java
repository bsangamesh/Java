package com.DownloadException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DownloadExceptionCode {

	public static void main(String[] args) throws DownloadException, IOException {
    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String fileName = read.readLine();		
		FileInputStream input = new FileInputStream(fileName);
		
		if(input.available() <1000) {
			throw new DownloadException();
		}
    }

	public static class DownloadException extends Exception {

	}

}
