package com.java8.defaultinterface.model;

public class Student implements Comparable<Student> {

	private String name;
	private Integer age;

	public Student(String name, Integer age) {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		return this.getAge().compareTo(o.getAge());
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s]", name, age);
	}

}
