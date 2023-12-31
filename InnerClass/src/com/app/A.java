package com.app;

/*
 * Nested inner class
 * inner class can assess all its outer class members
 */
public class A {
	int a = 1;
	private int b =2;
	public static int c = 3;
	
	public void method() {
		B bb = new B();
		System.out.println("Inside class A" + a + b + c + bb.x);
	}

	class B {
		public int x = 10;

		public void method() {
			System.out.println("Inside inner class B"+ a + b + c + x);
		}

		class C {

			public void method() {
				System.out.println("Inside inner class C"+ a + b + c);
			}
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a.method();
		A.B b = a.new B();
		b.method();
		A.B.C c = b.new C();
		c.method();
		
		
	}

}
