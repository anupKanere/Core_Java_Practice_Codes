package com.app;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
//		File f1=new File("Ak");
//		f1.mkdir();//creates directory
		File f2=new File("Notes.txt");
		f2.createNewFile();//creates file
//		System.out.println(f1.exists());
		System.out.println(f2.exists());
//		System.out.println(f1.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f2.length());
		
		File f = new File("Notes.txt");
		FileWriter fw = new FileWriter(f);
		fw.write(22);
		fw.write("Hi...i m writing through java programming");
		fw.write("\n");
		fw.write("Hi...i m writing through java programming on next line");
		fw.write(" Learning File IO");
		char[] ch={'a','b','c'};
		fw.write("\n");
		fw.write(ch);
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(f);
//		int i = fr.read();
//		while(i != -1) {
//			System.out.println((char)i);
//			i = fr.read();
//		}
		char [] c = new char[(int)f.length()];
		fr.read(c);
		for(char ch1 : c) {
			System.out.println(ch1);
		}
		fr.close();
		
	}
}
