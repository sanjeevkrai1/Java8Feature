package com.java8.defaultinterface;


import java.util.Collections;
import java.util.List;

import com.java8.defaultinterface.model.Student;

public interface Sorting {

	default List<Student> sortStudent(List<Student> list){
		Collections.sort(list);
		return list;
	}
	
	public static void greet(String greetMsg) {
		System.out.println("Welcome "+greetMsg);
	}
	
	public Integer getMaximum(List<Integer> list);
}
