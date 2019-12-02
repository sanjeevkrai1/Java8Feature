package com.test.stream.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Client4 {

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 1, 5 };
		
		IntStream stream = Arrays.stream(a);
//		stream.distinct().forEach(System.out::println);
		long count = stream.distinct().count();
		
		System.out.println(count);

	}

}
