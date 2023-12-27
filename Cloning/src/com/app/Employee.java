package com.app;

/*
 * Shallow Copy Example
 */
public class Employee implements Cloneable{
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee(1,"Anup");
		System.out.println(e1.getName());
		
		Employee e2 = (Employee) e1.clone();
		e2.setName("AK");
		
		System.out.println(e1.getName());
		System.out.println(e2.getName());

	}

}
