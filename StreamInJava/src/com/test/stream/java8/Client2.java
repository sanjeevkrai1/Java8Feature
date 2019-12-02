package com.test.stream.java8;

import java.util.ArrayList;
import java.util.List;

public class Client2 {

	public static void main(String args[]) {
		List<Student> student = new ArrayList<>();
		student.add(new Student("AV", 28));
		student.add(new Student("KV", 46));
		student.add(new Student("RV", 22));
		student.add(new Student("SV", 21));
		student.add(new Student("TV", 45));
		student.add(new Student("MB", 32));
		student.add(new Student("TV", 29));
		student.add(new Student("SK", 21));
		
		student.parallelStream().forEach(e->doProcess(e));

	}

	private static void doProcess(Student e) {
		System.out.println("Name : "+e.getName() + "\t" +"age : "+e.getAge());
	}

}
