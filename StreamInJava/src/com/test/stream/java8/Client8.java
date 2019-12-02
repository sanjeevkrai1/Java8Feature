package com.test.stream.java8;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client8 {

	public static void main(String args[]) throws IOException {

		Path path = Paths.get("D://output.txt");
		Stream<String> lines = Files.lines(path);
		lines.forEach(System.out::println);

		Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
		
		streamWithCharset.forEach(System.out::println);
		
		System.out.println("******************************************************");
		
		Stream.of("a" ,"b","c","d","e").filter(e-> 
											e.contains("b"))
												.collect(Collectors.toList())
												.forEach(e->{
														System.out.println(e);
												});
		
		System.out.println("******************************************************");
		Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd")
															.skip(1);
		onceModifiedStream.forEach(System.out::println);
		
		System.out.println("******************************************************");
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		
		long count = list.stream().map(e->e.substring(1, 3)).sorted().count();
		System.out.println(count);
		
		System.out.println("******************************************************");
		list.stream().map(e 
						-> e.substring(1, 3))
						.collect(Collectors.toList())
						.forEach(System.out::println);
		
		System.out.println("***************************Accumulator***************************");
		
		Stream.of(10,20,22,12,14).reduce((x,y)->x+y).ifPresent(System.out::println);
		Stream.of(10,20,22,12,14).reduce(Integer::sum).ifPresent(System.out::println);
		Stream.of("java", "c", "c#", "python").reduce((x,y)->x+" | "+y).ifPresent(System.out::println);
		
		System.out.println("***************************Identity-Accumulator***************************");
		
		Integer arrSum = Stream.of(10,20,22,12,14).reduce(1000, Integer::sum);
		System.out.println(arrSum);
		arrSum = Stream.of(10,20,22,12,14).reduce(1000, (x,y)->x+y);
		System.out.println(arrSum);
		String result = Stream.of("java", "c", "c#", "python").reduce("Languages:", (x,y)->x+" | "+y);
		System.out.println(result);
		
		System.out.println("***************************Identity-Accumulator-combiner***************************");
		
		Integer reduceResult = Stream.of(10,20,22,12,14).parallel().reduce(1000,(x,y)-> x+y ,(p,q)->{
			System.out.println("Combiner was called");
			return p+q;
		});
		System.out.println(reduceResult);
		
		


	}

}
