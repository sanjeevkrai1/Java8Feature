package com.test.lambda.demo4;

public class Employee implements Comparable<Employee>{

	private String name;
	private String address;
	private String phNo;

	public Employee(String name, String address, String phNo) {
		super();
		this.name = name;
		this.address = address;
		this.phNo = phNo;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhNo() {
		return phNo;
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, address=%s, phNo=%s]", name, address, phNo);
	}

	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}

}
