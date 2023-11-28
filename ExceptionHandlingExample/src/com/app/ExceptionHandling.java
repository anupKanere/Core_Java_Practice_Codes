package com.app;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			String str = null;
			int a = str.length();
			int res = 10 / 0;
			System.out.println("Statement 3");

		} catch (  ArithmeticException | NullPointerException e) {
			System.out.println("inside catch block : " + e);

		} finally {
			System.out.println("Inside finally block");
		}

		System.out.println("Outside try-catch block");

	}

}
