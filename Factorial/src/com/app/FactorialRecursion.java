package com.app;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the number to find its factorial : ");
			int num = sc.nextInt();

			int fact = factRecursion(num);
			System.out.println("Factorial of number " + num + " is " + fact);

		}

	}

	// finding factorial using recursion method
	public static int factRecursion(int num) {

		if (num == 1)
			return 1;
		else
			return num * factRecursion(num - 1);
	}

}
