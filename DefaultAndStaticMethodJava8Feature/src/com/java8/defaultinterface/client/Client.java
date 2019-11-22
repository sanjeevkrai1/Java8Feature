package com.java8.defaultinterface.client;


import java.util.ArrayList;
import java.util.List;

import com.java8.defaultinterface.Sorting;
import com.java8.defaultinterface.impl.StudentImpl;
import com.java8.defaultinterface.model.Student;

public class Client {

	public static void main(String args[]) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Sanjeev", 33));
		list.add(new Student("Mrinal", 28));
		list.add(new Student("Peeyush", 31));
		list.add(new Student("Brijesh", 27));
		
		System.out.println("*************Student list before sort**************");
		Sorting studentImpl = new StudentImpl();
		list = studentImpl.sortStudent(list);
		System.out.println("*************Student list after sort**************");
		System.out.println(list);
		
		list.forEach(e-> {
			System.out.println(e.getName() +" : "+e.getAge());
		});

		Sorting.greet("Sanjeev Rai");
	
		
	}

}
