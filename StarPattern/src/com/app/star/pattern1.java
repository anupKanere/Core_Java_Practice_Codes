package com.app.star;

public class pattern1 {

	public static void main(String[] args) {

		pattern1(4);
		System.out.println();
		System.out.println();
		pattern2(4);
		System.out.println();
		System.out.println();
		pattern3(4);
		System.out.println();
		System.out.println();
		pattern4(4);
		System.out.println();
		System.out.println();
		pattern5(4);
		System.out.println();
		System.out.println();
		pattern6(4);
		System.out.println();
		System.out.println();
		pattern7(4);
		System.out.println();
		System.out.println();
		pattern8(4);
		System.out.println();
		System.out.println();
		pattern9(6);
		System.out.println();
		System.out.println();
		pattern10(6);
		System.out.println();
		System.out.println();
		pattern10_2(6);
		System.out.println();
		System.out.println();
		pattern11(6);
		System.out.println();
		System.out.println();
		pattern12_1(6);
		System.out.println();
		System.out.println();
		pattern12_2(6);
		System.out.println();
		System.out.println();
		pattern13_1(6);
		System.out.println();
		System.out.println();
		pattern13_2(6);
		System.out.println();
		System.out.println();
		pattern14(6);
		System.out.println();
		System.out.println();
		pattern15(6);
		System.out.println();
		System.out.println();
		pattern16(6);

	}

	static void pattern1(int n) {
		System.out.println("Pattern 1 :Square Pattern : ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void pattern2(int n) {
		System.out.println("Pattern 2 :leftside Right angle triangle : ");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	static void pattern3(int n) {
		System.out.println("Pattern 3 : Bottom right angle traingle:  ");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		System.out.println("Pattern 4 : Right half Diamond");
		for (int row = 1; row <= n; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = 1; row <= n; row++) 
		{
			for (int col = n - 1; col >= row; col--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void pattern5(int n) {
		System.out.println("Pattern 5 :");
		for (int i = 1; i <= n; i++) 
		{
			for (int j = n - 1; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern6(int n)
	{
		System.out.println("Pattern 6 :");
		for(int i = 1 ; i <=n ; i++)
		{
			for(int j=1 ; j<i  ; j++ )
			{
				System.out.print(" ");
			}
			for(int k = n ; k >= i ;k--)
			{
				System.out.print("*");
			}
			System.out.println();	
		}		
	}
	static void pattern7(int n)
	{
		System.out.println("Pattern 7 : Left half Diamond");
		for(int i = 1; i <=n; i++)
		{
			for(int j= n -1; j >=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <=i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < n ; i++)
		{
			for(int j = 1 ; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = n-1; k >=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern8(int n)
	{
		System.out.println("Pattern 8 : Pyramid");
		for(int i = 1; i <= n ; i++)
		{
			for(int j = n-1; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	static void pattern9(int n)
	{
		System.out.println("Pattern 9 : Pyramid - 2 ");
		for (int i = 1; i <= n; i++) 
		{
			for (int j = n-1; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k < i*2; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern10(int n)
	{
		System.out.println("Pattern 10 : upside-down Pyramid  ");
		for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j < i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = n*2-1 ; k > i*2; k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern10_2(int n)
	{
		System.out.println("Pattern 10 : upside-down Pyramid  ");
		for (int i = n; i >=1; i--)
		{
			for (int j = n;  j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1 ; k < i*2; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern11(int n )
	{
		System.out.println("Pattern 11 : Filled Diamond  ");
		for (int i = 1; i <=n ; i++) 
		{
			for (int j = n-1; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k < i*2 ; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) 
		{
			for (int j = 1; j <=i ; j++) 
			{
				System.out.print(" ");
			}
			for (int k = n*2-1; k > i*2; k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void pattern12_1(int n)
	{
		System.out.println("Pattern 12.1 : ");
		for (int i = 1; i <=n; i++) 
		{
			for (int j = 1; j <i; j++)
			{
				System.out.print(" ");
			}
			for (int j = i; j <=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void pattern12_2(int n)
	{
		System.out.println("Pattern 12.2 : ");
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				if(i>=2 && j < i)
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern13_1(int n)
	{
		System.out.println("Pattern 13.1 : ");
		for (int i = 1; i <=n ; i++) 
		{
			for(int j = n; j >=i ; j--)
			{
				if (i <= n-1 && j > i ) 
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern13_2(int n)
	{
		System.out.println("Pattern 13.2 : ");
		for (int i = 1; i <=n ; i++) 
		{
			for(int j = n - 1 ; j >=i ; j--)
			{
				System.out.print(" ");
			}
			for (int j = i; j <= i ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern14(int n)
	{
		System.out.println("Pattern 14 : ");
		for (int i = 1; i <=n ; i++) 
		{
			for(int j = n - 1 ; j >=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k < i*2 ; k++ )
			{
				if( k > 1 && k < i*2-1)
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
	static void pattern15(int n)
	{
		System.out.println("Pattern 15 : ");
		for(int i = n; i >= 1 ; i--)
		{
			for (int j = n; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k < i*2; k++) 
			{
					if(k > 1 && k < i*2-1)
					{
						System.out.print(" ");
					}
					else
						System.out.print("*");
			}
			System.out.println();
		}

	}
	static void pattern16(int n)
	{
		for (int i = 1; i <=n ; i++) 
		{
			for(int j = n - 1 ; j >=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k < i*2 ; k++ )
			{
				if( k > 1 && k < i*2-1)
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1)
				System.out.println("");
			else
				System.out.println("*");
		}
	}

}











