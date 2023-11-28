package com.app;

import java.util.Scanner;

public class CheckArmstrongNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int result = 0;
            int n = 0;
            int remainder;

            System.out.println("Enter the num to check for Armstrong num : ");
            int num = sc.nextInt();
            int originalNum = num;
            
            // Calculate the number of digits
            int tempNum = num;
            while (tempNum != 0) {
                tempNum = tempNum / 10;
                n++;
            }

            // Calculate the result using the digits
            tempNum = originalNum;
            while (tempNum != 0) {
                remainder = tempNum % 10;
                result += Math.pow(remainder, n);
                tempNum /= 10;
            }

            if (result == originalNum)
                System.out.println("Number is Armstrong Number ");
            else
                System.out.println("Number is not an Armstrong Number");
        }
    }
}
