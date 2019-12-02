package com.test.collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client1 {

	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"), new Product(14, "orange"), new Product(13, "lemon"),
				new Product(23, "bread"), new Product(13, "sugar"));
		
		productList
			.stream()
				.map(Product :: getProductName)
				.collect(Collectors.toList()).forEach(System.out::println);;

		System.out.println("**********************Collect in Set*******************");		
				
		productList
				.stream()
					.map(Product :: getProductName)
					.sorted((a ,b)-> a.compareTo(b)).collect(Collectors.toSet()).forEach(System.out::println);	
	
		System.out.println("**********************Collect in Set*******************");	
		String listToString = productList.stream().map(Product::getProductName)
				  .collect(Collectors.joining(", ", "[", "]"));
		
		System.out.println(listToString);
		
		System.out.println("**********************Average of price*******************");
		
		Double averageOfPrice = productList.stream()
					.collect(Collectors.averagingInt(Product :: getPrice));
		
		System.out.println(averageOfPrice);
		
		System.out.println("**********************Sum of price*******************");
		
		Integer sumOfPrice = productList.stream()
					.collect(Collectors.summingInt(Product :: getPrice));
		System.out.println(sumOfPrice);
		
		System.out.println("**********************Group by in Collect*******************");
		
		Map<Integer, List<Product>> map = productList.stream()
													     .collect(Collectors.groupingBy(Product :: getPrice));
		map.forEach((k,v)->{
			System.out.println("kye   \t : "+k);
			System.out.println("Value \t : "+v);
		});
		
		System.out.println("**********************Dividing stream’s elements into groups according to some predicate*******************");
	
		Map<Boolean, List<Product>> collect = productList.stream().collect(Collectors.partitioningBy(e->e.getPrice() > 15));
		collect.forEach((k,v)-> {
			System.out.println("kye   \t : "+k);
			System.out.println("Value \t : "+v);
		});
		
		System.out.println("**********************Pushing the collector to perform additional transformation*******************");
		productList.stream().collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		
		productList.stream()
						.collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet))
											.forEach(System.out::println);;
		
	}

}
