package com.test.lambda.demo3;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Stream;

public class Client {

	public static void main(String args[]) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Mac", 33));
		
		empList.add(new Employee("Sean", 34));
		empList.add(new Employee("Andrew", 40));
		empList.add(new Employee("Martin", 44));

		System.out.println("***************External processing on loop*********************");

		for (Employee emp : empList)
			System.out.println(emp);
		System.out
				.println("******************Internal and fast processing by using stream in Java8*****************\n");
		System.out.println("\t ************Sequential processing*******************\n");

		empList.stream().forEach(e -> System.out.println("\t\t " + e));

		System.out.println("\t ************Parallel processing ordered*******************\n");

		empList.parallelStream().forEachOrdered(e -> System.out.println("\t\t " + e));

		System.out.println("\t ************Parallel processing unordered*******************\n");

		empList.parallelStream().forEach(e -> System.out.println("\t\t " + e));

		
		List<String> list = new ArrayList<>();
		
		list.add("Sanjeev");
		list.add("Mrinal");
		list.add("Peeyush");
		list.add("Brijesh");
		
		Stream<Student> stdStream = list.stream().map(Student :: new);
		stdStream.forEach(e -> System.out.println(e));
		
		
		Stream<Student> stdStream1 = list.stream().map(Student :: new);
		Student[] buttons = stdStream1.toArray(Student[]::new);
		
		for (int i = 0; i < buttons.length; i++) {
			
			System.out.println(buttons[i]);
			
		}

		
	}
}
