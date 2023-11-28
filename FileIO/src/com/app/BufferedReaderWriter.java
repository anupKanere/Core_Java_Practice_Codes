package com.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Notes.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = { 'a', 'b', 'c', 'd' };
		bw.write(ch);
		bw.newLine();
		bw.write("Anup");
		bw.newLine();
		bw.write("Java Developer");
		bw.flush();
		bw.close();
		
		FileReader fr = new FileReader("Notes.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

}
//Note :When ever we are closing BufferedWriter automatically underlying writer will be closed and we are not close explicitly.

