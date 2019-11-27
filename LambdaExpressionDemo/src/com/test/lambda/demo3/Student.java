package com.test.lambda.demo3;


public class Student {

	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s]", name);
	}

}
