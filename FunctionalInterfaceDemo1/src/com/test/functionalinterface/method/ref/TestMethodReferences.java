package com.test.functionalinterface.method.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestMethodReferences {

	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Mac", 33));
		studentList.add(new Student("Sean", 34));
		studentList.add(new Student("Andrew", 40));
		studentList.add(new Student("Martin", 44));

		
		System.out.println("Without using method refernce with consumer funcitonal interface ");
		studentList.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.println(t);
			}
		});
		
		System.out.println("*************method references**************");
		
		studentList.forEach(System.out :: println);
		
	}

}
