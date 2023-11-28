package com.app;
import java.util.Arrays;

public class MissingAndRepeated {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 1};
        int[] result = findMissingAndRepeatedNumber(nums);
        System.out.println("Repeated Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }

    public static int[] findMissingAndRepeatedNumber(int[] arr) {
        int n = arr.length;
        int[] res = new int[2];

        Arrays.sort(arr);

        for (int i = 1; i < n; i++) { // Start from index 1
            if (arr[i] == arr[i - 1]) {
                res[0] = arr[i]; // Repeated number
                break;
            }
        }
        int expectedSum = n * (n + 1) / 2;
        int currSum = 0;
        for (int i : arr) {
            currSum += i;
        }

        res[1] = expectedSum - (currSum - res[0]); // Missing number

        return res;
    }
}
