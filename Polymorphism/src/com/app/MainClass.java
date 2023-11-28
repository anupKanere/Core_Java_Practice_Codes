package com.app;

class A {
	void print() {
		System.out.println("Inside class A print method");
	}
}

class B extends A {

//	@Override
	void print() {
		super.print();
		System.out.println("Inside classs B print method");
	}
}

public class MainClass {

	public static void main(String[] args) {
		A a = new B();// upcasting
		a.print();
		B b = (B) a;// downcasting
		b.print();
		A aa = (A) b;
		aa.print();

	}

}
