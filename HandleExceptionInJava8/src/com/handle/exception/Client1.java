package com.handle.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Client1 {

	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(1,2,0,4,5,6,7,8);
		
		numbers.stream().forEach(loadWrapperException(e-> System.out.println(50/e)));
		
	}
	
	public static Consumer<? super Integer> loadWrapperException(Consumer<? super Integer> consumer) {
		return i -> {
			try {
				consumer.accept(i);
			}catch(Exception e) {
				e.printStackTrace();
			}
		};
	}
	
	
	


}
