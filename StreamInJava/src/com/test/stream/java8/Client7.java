package com.test.stream.java8;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Client7 {
	
	public static void main(String args[]) {
		Stream<String> splitAsStream = Pattern.compile(",").splitAsStream("a,b,c");
		splitAsStream.forEach(e -> System.out.println(e));
	}

}
