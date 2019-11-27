package com.test.lambda.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client2 {

	public static void main(String args[]) {
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Mac", 33));
		studentList.add(new Student("Sean", 34));
		studentList.add(new Student("Andrew", 40));
		studentList.add(new Student("Martin", 44));
		
		Collections.sort(studentList ,
				(student1 , student2) -> 
								        student1.getName().compareTo(student2.getName()));
	
		studentList.forEach(e -> System.out.println(e));
	}
}
