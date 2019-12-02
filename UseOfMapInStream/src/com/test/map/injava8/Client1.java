package com.test.map.injava8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client1 {

	public static void main(String args[]) {
		 List<Staff> staff = Arrays.asList(
	                new Staff("mkyong", 30, new BigDecimal(10000)),
	                new Staff("jack", 27, new BigDecimal(20000)),
	                new Staff("lawrence", 33, new BigDecimal(30000))
	        );
		 
		 List<String> namesList = staff.stream()
		      .map(Staff :: getName)
		      .collect(Collectors.toList());
		 
		 System.out.println(namesList);
		 System.out.println("************************************************");
		 
		 staff.stream().map(temp->{
			 StaffPublic staffPublic = new StaffPublic();
			 
			 staffPublic.setName(temp.getName());
			 staffPublic.setAge(temp.getAge());
	            if ("mkyong".equals(temp.getName())) {
	            	staffPublic.setExtra("this field is for mkyong only!");
	            }
			 return staffPublic;
		 }).collect(Collectors.toList())
		 .forEach(System.out::println);
	
		 System.out.println("*******************************************");
		 
		 System.out.println("The stream after applying "
                 + "the function is : "); 

		 // Creating a list of Strings 
		 List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", 
                                "Computer", "Science", "gfg"); 
		 
		 list.stream()
		 	 .map(String:: length)
		 	 .forEach(System.out::println);

		 System.out.println("The stream after applying "
                 + "the function is : "); 
		 System.out.println("*******************************************");
		 // Creating a list of Integers 
		 List<String> list1 = Arrays.asList("geeks", "gfg", "g", 
                                "e", "e", "k", "s"); 
		 
		 List<String> resultList = list1.stream().map(String ::toUpperCase).collect(Collectors.toList());
		 System.out.println(resultList);
		 
		 System.out.println("*******************************************");
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 List<Integer> squareList = numbers.stream().map(e-> e*e).collect(Collectors.toList());
		 System.out.println(squareList);
		 
		 System.out.println("*******************************************");
		 
		 List<String> cities = Arrays.asList("London", "HongKong", 
                 "Paris", "NewYork");
		 
		 cities.stream()
		 		.map(String :: toUpperCase)
		 		.collect(Collectors.toList())
		 		.forEach(System.out::println);
	}

}
