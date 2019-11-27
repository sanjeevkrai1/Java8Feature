package com.test.lambda.demo4;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String args[]) {
		
		List<Employee> lst = new ArrayList<>();	
		lst.add(new Employee("Sanjeev", "Delhi", "12345"));
		lst.add(new Employee("Abhi", "Delhi", "12345"));
		lst.add(new Employee("Naval", "Delhi", "12345"));
		lst.add(new Employee("Brijesh", "Delhi", "12345"));

		
		MyInterface myInterface = (list) ->{
			list.stream().forEachOrdered(System.out::println);
		};
		
		
		myInterface.sortEmployee(lst);
		myInterface.displayList(lst);
	}

}
