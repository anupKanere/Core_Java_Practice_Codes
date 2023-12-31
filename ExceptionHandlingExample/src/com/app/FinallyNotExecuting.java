package com.app;

public class FinallyNotExecuting {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			System.exit(0);
			int res = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");

		}
	}
}
//finally block will not execute if System.exit()method is called
