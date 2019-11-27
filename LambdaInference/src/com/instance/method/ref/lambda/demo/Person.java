package com.instance.method.ref.lambda.demo;

public class Person {

	private String name;
	private String age;

	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}

}
