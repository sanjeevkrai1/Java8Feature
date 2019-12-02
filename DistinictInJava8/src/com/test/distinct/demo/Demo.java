package com.test.distinct.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String args[]) {
		
		 List<String> list = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");
		 long count = list.stream().distinct().count();
		 System.out.println(count);
		 
		 System.out.println("*********************************************************");
		 
		 String string = list.stream().distinct().collect(Collectors.joining(","));
		 
		 System.out.println(string);
		 
		 System.out.println("*********************************************************");
		 
		 List<String> list2 = list.stream().distinct().collect(Collectors.toList());
		 
		 System.out.println(list2);
		
		 System.out.println("*********************************************************");
		 
		 
		 List<Book> bookList = new ArrayList<>();
		 {
	        	bookList.add(new Book("Core Java", 200));
	        	bookList.add(new Book("Core Java", 200));
	        	bookList.add(new Book("Learning Freemarker", 150));        	
	        	bookList.add(new Book("Spring MVC", 300));
	        	bookList.add(new Book("Spring MVC", 300));
	     }
		 
		 long distinctBookCount = bookList.stream()
		 			.distinct()
		 			.count();
		 
		 System.out.println(distinctBookCount);
		 
		 
		 System.out.println("*********************************************************");
		 List<Book> distinctBookList = bookList.stream()
		 			.distinct()
		 			.collect(Collectors.toList());
		 
		 distinctBookList.forEach(e->{
			 System.out.println("Book Name -> "+e.getName() +"\t\t\t"+"Book Price ->"+e.getPrice());
		 });
	}

}
