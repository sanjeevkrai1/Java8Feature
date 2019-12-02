package com.test.map.injava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String args[]) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		
		alpha.stream()
			.map(String :: toUpperCase)
			.collect(Collectors.toList())
			.forEach(e-> System.out.println(e));

		System.out.println("******************************************");
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		num.stream()
			.map(n->n*2)
			.collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
