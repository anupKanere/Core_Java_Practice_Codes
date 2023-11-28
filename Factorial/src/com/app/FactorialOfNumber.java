package com.app;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the Number to find its Factorial : ");
			int num = sc.nextInt();
			int fact = 1;

			while (num >= 1) {
				fact = fact * num;
				num--;
			}

			System.out.println(fact);
		}

	}

}
