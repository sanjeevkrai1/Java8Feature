package com.test.foreach.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

	public static void main(String args[]) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Samson", 40));
		empList.add(new Employee("Sanjeev", 38));
		empList.add(new Employee("Andrew", 45));
		
		empList.forEach(e ->{
			System.out.println("Name \t : "+ e.getName());
			System.out.println("Age \t : "+ e.getAge());
		});
		
		empList.forEach(System.out::println);
		
		
		
		Map<String , Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
	
		map.forEach((k , v)->{
			System.out.println("Key \t	: "+k +" \t <-----> \t Value \t : "+v);
		});
		
		System.out.println("*******************************************************");
		map.entrySet().forEach(e->{
			System.out.println("Key \t	: "+e.getKey() +" \t <-----> \t Value \t : "+e.getValue());
		});
		
		
	}

}
