package com.handle.exception;

import java.util.Arrays;
import java.util.List;

public class Client3 {

	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(1,2,0,4,5,6,7,8);
		numbers.forEach(GenericException.handleException(e->System.out.println(50/e), ArithmeticException.class));
	}

}
