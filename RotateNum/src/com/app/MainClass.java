package com.app;

public class MainClass {

	public static void main(String[] args) {
        int num1 = 2567;
        int num2 = 4298;
        int num3 = 8923;
        
        int firstNum = rotate(num1 , 1);
        int secondNum = rotate(num2 , 2);
        int thirdNum = rotate(num3 , 3);
        
        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(thirdNum);
        


	}
	
	public static int rotate(int num , int count)
	{
		String numStr = String.valueOf(num);
		count = count % num;
		int len = numStr.length();
		String rotatedNum = numStr.substring(len-count) + numStr.substring(0 , len-count);
		return Integer.parseInt(rotatedNum);
		
	}

}
