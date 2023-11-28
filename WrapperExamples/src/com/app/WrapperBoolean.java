package com.app;

public class WrapperBoolean {
	public static void main(String[] args) throws Exception {
		Boolean b1 = new Boolean("yes");
		Boolean b2 = new Boolean("no");
		System.out.println(b1);// false
		System.out.println(b2);// false
		System.out.println(b1.equals(b2));// true
		System.out.println(b1 == b2);// false
	}
}