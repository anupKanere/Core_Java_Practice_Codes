package com.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("cricket.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("Virat");
		pw.flush();
		pw.close();
	}

}
