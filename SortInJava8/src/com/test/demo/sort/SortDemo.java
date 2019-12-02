package com.test.demo.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {
	
	public static void main(String args[]) {
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
		
		List<String> sortedList = list.stream()
				.sorted()
					.collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		
		List<String> reverseList = list.stream()
					.sorted(Comparator.reverseOrder())
						.collect(Collectors.toList());
		
		System.out.println(reverseList);
		
		System.out.println("************************************************************");
		
		
		List<User> users = Arrays.asList(
	            new User("C", 30),
	            new User("D", 40),
	            new User("A", 10),
	            new User("B", 20),
	            new User("E", 50));
		
		List<User> sortedByAgeList = users.stream()
				.sorted(Comparator.comparingInt(User :: getAge))
				.collect(Collectors.toList());
	
		System.out.println(sortedByAgeList);
		System.out.println("************************************************************");
		
		List<User> sortedByNameList = users.stream()
				.sorted(Comparator.comparing(User :: getName))
					.collect(Collectors.toList());
		
	System.out.println(sortedByNameList);
	
	System.out.println("************************************************************");
	
	 }

}
