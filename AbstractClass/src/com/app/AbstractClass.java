package com.app;

public abstract class AbstractClass {
	
	private int age;
	private String name;
	
	public AbstractClass() {
		
		System.out.println("Inside Abstract class constructor");
	}

	public AbstractClass(int age, String name) {
		super();
		System.out.println("Inside abstract class para-constructor");
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		
		System.out.println("Printing inside abstract class concrete method");
	}
	
	public abstract int result(int a , int b);
}
