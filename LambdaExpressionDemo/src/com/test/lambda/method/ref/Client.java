package com.test.lambda.method.ref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Client {

	public static void main(String args[]) {
		
		List<String> names = new ArrayList<>();

		names.add("Sanjeev");
		names.add("Mrinal");
		names.add("Peeyush");
		names.add("Brijesh");
		names.add("Brijesh");
		Collections.sort(names , (x , y)-> x.compareToIgnoreCase(y));
		names.parallelStream().forEachOrdered(System.out::println);
		
		System.out.println("************************************");
		Collections.sort(names , String::compareToIgnoreCase);
		
		names.parallelStream().forEachOrdered(System.out::println);
		
		System.out.println("********************************");
		
		names.add(null);
		names.removeIf(Objects :: isNull );
		
		names.parallelStream().forEach(System.out::println);
			
		
		
	}

}
