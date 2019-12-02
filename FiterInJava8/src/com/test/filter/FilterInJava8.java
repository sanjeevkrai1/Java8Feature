package com.test.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterInJava8 {

	public static void main(String args[]) {
		 List<String> lines = Arrays.asList("spring", "node", "mkyong");
		 
		 
		 List<String> lst = lines.stream() // creating the stream
		 		.filter(line -> !line.equals("mkyong")) // we dont want mkyong in list
		 		.collect(Collectors.toList()); // convert in list
		 
		 lst.stream()
		 		.forEach(System.out::println);
		 
		 
		 System.out.println("****************************************************************");
		 
		 List<Person> persons = Arrays.asList(
	                new Person("mkyong", 30),
	                new Person("jack", 20),
	                new Person("lawrence", 40)
	        );
		 
		 Person  person = persons.stream()
		 		.filter(e -> "jack".equalsIgnoreCase(e.getName()))
		 		.findAny()
		 		.orElse(null);
		 
		 System.out.println(person);
		 
		 System.out.println("****************************************************************");
		 
		 Person person2 = persons.stream()
		 		.filter(e-> "abhi".equalsIgnoreCase(e.getName()))
		 		.findAny()
		 		.orElse(null);
		 
		 System.out.println(person2);
		 
		 System.out.println("****************************************************************");
		 
		 Person person3 = persons.stream()
		 		.filter(e -> e.getName().equals("jack") && e.getAge() == 20)
		 		.findFirst().orElse(null);
		 
		 System.out.println(person3);
		 
		 System.out.println("****************************************************************");
		 
		 
		 Person person4 = persons.stream()
	                .filter(p -> {
	                    if ("jack".equals(p.getName()) && 20 == p.getAge()) {
	                        return true;
	                    }
	                    return false;
	                }).findAny()
	                .orElse(null);
		 
		 System.out.println(person4);
	
		 System.out.println("****************************************************************");
		 String personName = persons.stream()
		 		.filter(e -> "jack".equalsIgnoreCase(e.getName()))
		 		.map(Person :: getName).findAny().orElse("");
		 
		 System.out.println(personName);
		 
		 System.out.println("****************************************************************");
		 
	}

}
