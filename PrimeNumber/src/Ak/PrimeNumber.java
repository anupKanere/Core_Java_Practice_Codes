package Ak;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int i, count;
			System.out.println("Enter the n upto which u want to check the prime numbers : ");
			int n = sc.nextInt();
			System.out.println("Prime numbers between 1 to " + n + "are : ");

			for (i = 2; i < n; i++) {
				count = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						count++;
				}
				if (count == 2)
					System.out.println(i + " ");

			}

		}

	}

}
