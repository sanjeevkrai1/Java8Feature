package com.test.stream.java8;

import java.util.stream.Stream;

public class Client6 {
	
	public static void main(String args[]) {
		
		Stream.iterate(1, e->e+2).limit(10).forEach(e->{
			System.out.println(e);
		});
		
	}

}
