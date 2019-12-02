package com.test.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author Sanjeev Rai
 *Stream + String[] + flatMap
 */
public class Client1 {

	public static void main(String args[]) {
		
		 String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		 List<String[]> lists = Arrays.asList(data);
		 Stream<String> streamOfString = lists.stream().flatMap(x -> Arrays.stream(x));
		 streamOfString.forEach(System.out::println);
		 System.out.println("******************************************************");
		 List<String> listOfString = lists.stream()
				 						   .flatMap(x -> Arrays.stream(x))
				 						   .collect(Collectors.toList());
		 
		 System.out.println(listOfString);
		 
		 
	}

}
