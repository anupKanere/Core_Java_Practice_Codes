package com.app;

public class AbstractClassDemo extends AbstractClass {

	private int serNo;

	public AbstractClassDemo() {
		super();
	}

	public AbstractClassDemo(int serNo, int age, String name) {
		super(age, name);
		System.out.println("Inside Demo class para-constructor");
		this.serNo = serNo;
	}

	public static void main(String[] args) {
		AbstractClassDemo obj = new AbstractClassDemo();
		int res = obj.result(10, 20);
		System.out.println(res);
		obj.print();

		AbstractClassDemo obj1 = new AbstractClassDemo(10, 25, "Anup");
		System.out.println("Age is " + obj1.getAge() + " Name = " + obj1.getName() + " Ser No = " + obj1.serNo);

	}

	@Override
	public int result(int a, int b) {

		return a + b;
	}

}
