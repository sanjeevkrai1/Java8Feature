package com.handle.exception;

import java.util.Arrays;
import java.util.List;

public class Client {
	
	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(1,2,0,4,5,6,7,8);
		
		numbers.stream().forEach(e->{
			try {
				int res = 50/e;
				System.out.println(res);
			}catch (ArithmeticException ex) {
				ex.printStackTrace();
			}
		});
		
	}

}
