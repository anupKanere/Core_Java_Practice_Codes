package com.app.fib_series;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int num3;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the nos of Fibonacci series you want : ");
			int count = sc.nextInt();

			for (int i = 1; i <= count; i++) {

				num3 = num2 + num1;
				System.out.println(num3);
				num1 = num2;
				num2 = num3;

			}
		}

	}

}
