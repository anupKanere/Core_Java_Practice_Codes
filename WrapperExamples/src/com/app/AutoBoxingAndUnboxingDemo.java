package com.app;

import java.util.*;

public class AutoBoxingAndUnboxingDemo {
	public static void main(String[] args) {
		Integer x = new Integer(10);
		Integer y = x;
		System.out.println(x == y);// true
		
		System.out.println("----------");
		
		Integer a=10;
		Integer b=10;
		System.out.println(a==b);//true
		
		System.out.println("----------");
		
		Integer p=new Integer(10);
		Integer q=10;
		System.out.println(p==q);//false
		
		System.out.println("----------");
		
		Integer x1=128;
		Integer y1= 128;
		System.out.println(x1==y1);//false
		
		System.out.println("----------");
		
		Integer x2=127;
		Integer y2= 127;
		System.out.println(x2==y2);//true
	}
}
