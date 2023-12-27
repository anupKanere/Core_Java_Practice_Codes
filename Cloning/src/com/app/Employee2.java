package com.app;

/*
 * Shallow Copy Example
 * override clone method in Company class and Employee class to perform deep copy
 */
public class Employee2 implements Cloneable {
	private int id;
	private String name;
	private Company company;

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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Employee2() {
		super();
	}

	public Employee2(int id, String name, Company c) {
		super();
		this.id = id;
		this.name = name;
		this.company = c;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee2 emp = (Employee2) super.clone();
		emp.company = (Company) company.clone();
		return emp;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee2 e1 = new Employee2(1, "Anup", new Company("AK"));
		System.out.println(e1.getCompany().getCompanyName());

		Employee2 e2 = (Employee2) e1.clone();
		e2.getCompany().setCompanyName("Updated");

		System.out.println(e1.getCompany().getCompanyName());
		System.out.println(e2.getCompany().getCompanyName());

	}

}
