package com.test.stream.java8;

import java.util.stream.Stream;

public class Client5 {

	public static void main(String args[]) {
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").add("d").build();
		
		streamBuilder.forEach(System.out::println);
		Stream.generate(()-> "element").limit(10).forEach(System.out::println);
		
	}

}
