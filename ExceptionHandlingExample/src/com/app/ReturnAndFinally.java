package com.app;

public class ReturnAndFinally {

	public static String someMethod() {
		try {
			System.out.println("Statement 1");
			return " returning ";

		} catch (Exception e) {
			System.out.println("Inside catch block");
		} finally {
			System.out.println("Inside finally block");

		}
		return "Method Returned successfully";
	}

	public static void main(String[] args) {

		someMethod();

	}

}
//finally block dominates over return statement so first finally block will be executed then it will return;

