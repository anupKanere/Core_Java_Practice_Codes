package com.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	private static final long serialVersionUID = 1L;
	int i = 10;
	int j = 20;
	transient int a = 25;
	final transient int k = 30;
	static int p = 40;
}

public class SerializableDemo {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		
		
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Deserialization ended");
		
		
		System.out.println(d2.i + "......" + d2.j + "...."+"......"+d2.a+ "..." + d2.k + "....." + d2.p );
	}
}