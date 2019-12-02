package com.test.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Sanjeev Rai
 * Stream + Primitive + flatMapToInt
 */

public class Client3 {

	public static void main(String args[]) {
		int [] a =  {1, 2, 3, 4, 5, 6};
		
		Stream<int[]> streamOfArr = Stream.of(a);
		
		streamOfArr.flatMapToInt(e-> Arrays.stream(e))
		            .forEach(e->System.out.println(e));
	
		 // Creating a List of Strings 
        List<String> list = Arrays.asList("5.6", "7.4", "4", 
                                          "1", "2.3"); 
        Set<String> collect = list.stream().flatMap(e -> Stream.of(e)).collect(Collectors.toSet());
        System.out.println(collect);

     // Creating a List of Strings 
        List<String> list1 = Arrays.asList("Geeks", "GFG","GeeksforGeeks", "gfg");
        
        list1.stream()
             .flatMap(e->  Stream.of(e.charAt(2)))
               .forEach(System.out::println);
        
        Integer [][] abc = { {2, 3, 5}, {7, 11, 13}, {17, 19, 23} };
        List<Integer[]> abcOf = Arrays.asList(abc);
        abcOf.stream().flatMap(e-> Arrays.stream(e)).forEach(System.out::println);;
        
      String [][] charArr =   { {"G", "E", "E"}, {"K", "S", "F"}, {"O", "R", "G"}, {"E", "E", "K", "S"} };
      List<String[]> asList = Arrays.asList(charArr);

     String str = asList.stream()
    		            .flatMap(e -> Arrays.stream(e))
    		              .collect(Collectors.joining(",")); 
     System.out.println(str);
	}
	
}
