package com.test.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * 
 * @author Sanjeev Rai
 * Stream + Set + flatMap  
 *
 */
public class Client2 {

	public static void main(String[] args) {

		 Student obj1 = new Student();
	        obj1.setName("mkyong");
	        obj1.addBook("Java 8 in Action");
	        obj1.addBook("Spring Boot in Action");
	        obj1.addBook("Effective Java (2nd Edition)");

	        Student obj2 = new Student();
	        obj2.setName("zilap");
	        obj2.addBook("Learning Python, 5th Edition");
	        obj2.addBook("Effective Java (2nd Edition)");

	        List<Student> list = new ArrayList<>();
	        list.add(obj1);
	        list.add(obj2);
	        
	        
	        System.out.println("List of object is ----------"+list);
	        
	        
	        System.out.println("*************************************");
	        List<String> listOfBookStream = list.stream()
	                    .map(e -> e.getBook())
	                      .flatMap(e->e.stream())
	                        .collect(Collectors.toList());

	
	        System.out.println(listOfBookStream);
	}

}
