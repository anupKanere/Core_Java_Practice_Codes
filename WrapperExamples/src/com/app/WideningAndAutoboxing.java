package com.app;

public class WideningAndAutoboxing {
	public static void methodOne(Integer l) {
		System.out.println("AutoBoxing dominates");
	}

	// if we comment all other methods and kept only this method then we will get
	// compile time error because int cannot be converted to wrapper but int can be
	// converted to Integer(Autoboxing) so above method is allowed single also and
	// below method is not allowed
	public static void methodOne(long l) {
		System.out.println("widening dominates");
	}

	public static void methodOne(long... l) {
		System.out.println("var-args dominates");
	}

	public static void main(String[] args) {
		int x = 10;
		methodOne(x);
	}

}
/*
 * widening dominates over Auto-boxing 
 * widening dominates over var-args
 * autoboxing dominates over var-args
 */
