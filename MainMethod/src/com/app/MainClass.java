package com.app;
/*
 * All the below main methods are valid possible combinations of main method
 */

import java.util.LinkedList;

public class MainClass {

//	-------------------------------------------------------
//	public static void main(String[] args) {
//		System.out.println("Inside main method");
//
//	}
//	-------------------------------------------------------
//	static public void main(String[] args) {
//		System.out.println("Inside main method");
//
//	}
//	-------------------------------------------------------

//	public final static void main(String[] args) {
//		System.out.println("Inside main method");
//
//	}

//	-------------------------------------------------------
//	public static void main(String... args) {
//	System.out.println("Inside main method");
//
//}
//	-------------------------------------------------------
//	public strictfp static void main(String... args) {
//	System.out.println("Inside main method");
//
//}

//	-------------------------------------------------------

//	public static void main(String... x) {
//	System.out.println("Inside main method");
//
//}
//	-------------------------------------------------------

//	public synchronized static void main(String... x) {
//	System.out.println("Inside main method");
//
//}
//	-------------------------------------------------------

//	final synchronized strictfp public static void main(String... anup) {
//	System.out.println("Inside valid main method");
//
//}
//	-------------------------------------------------------

	public static void main(String[] args) {
		System.out.println("Inside main method");

	}

	static {

		System.out.println("Inside static block");// static will not execute if main method is not present in class
//		System.exit(0);
	}

}
