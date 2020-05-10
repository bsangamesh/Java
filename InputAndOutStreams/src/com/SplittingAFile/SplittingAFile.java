package com.SplittingAFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplittingAFile {

	public static void main(String[] args) throws IOException {
		String fileName1 = null, fileName2 = null, fileName3 = null;
	    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
	        fileName1 = reader.readLine();
	        fileName2 = reader.readLine();
	        fileName3 = reader.readLine();
	    } catch(IOException e) {
	        e.printStackTrace();
	    }
	    //input stream, auto closes after try block
	    try (   FileInputStream in = new FileInputStream(fileName1);
	            FileOutputStream out2 = new FileOutputStream(fileName2);
	            FileOutputStream out3 = new FileOutputStream(fileName3)) {
	        //how long in bytes is the file to read
	        int fileLength = in.available();
	        //the file length, file 2 and 3 should have
	        int toWrite2, toWrite3;
	        //the number of bytes to save in file 2 and 3 are file1 / 2
	        toWrite2 = toWrite3 = fileLength / 2;
	        //if filelength file1 is odd, then add 1 byte to file2 (that byte falls out due to division)
	        if (fileLength % 2 != 0)
	            toWrite2++;

	        //define a byte array with file1 length
	        byte[] data = new byte[fileLength];
	        in.read(data, 0, fileLength);
	        //write the data 0-toRead2 and toRead2-toRead3
	        out2.write(data, 0, toWrite2);
	        out3.write(data, toWrite2, toWrite3);

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
