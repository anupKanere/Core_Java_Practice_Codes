package com.app;

public class Company implements Cloneable {
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String name) {
		this.companyName = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Company(String name) {
		this.companyName = name;
	}

	public Company() {
		
	}
}
