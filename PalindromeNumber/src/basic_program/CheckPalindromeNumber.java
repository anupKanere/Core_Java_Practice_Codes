package basic_program;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int reversedNumber = 0, remainder;
			System.out.println("Enter the num which u want to check it for palindrome or not");
			int num = sc.nextInt();

			int originalNumber = num;

			while (num != 0) {
				remainder = num % 10;
				reversedNumber = reversedNumber * 10 + remainder;
				num = num / 10;
			}

			if (originalNumber == reversedNumber)
				System.out.println("Number " + originalNumber + " is Palindrome number");
			else
				System.out.println("Number " + originalNumber + " is not a Palindrone number");

		}

	}

}
