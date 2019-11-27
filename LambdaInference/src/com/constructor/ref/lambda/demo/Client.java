package com.constructor.ref.lambda.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Client {

	public static void main(String args[]) {

		List<Integer> numbers = Arrays.asList(4, 9, 36, 100);

		numbers.parallelStream().forEachOrdered(System.out::println);

		List<Double> squreRoot = Client.findSqureList(numbers, Integer::new);
		System.out.println("********************Sqrt***********************");
		squreRoot.parallelStream().forEachOrdered(System.out::println);
	}

	private static List<Double> findSqureList(List<Integer> numbers, Function<Integer, Integer> f) {

		List<Double> list = new ArrayList<Double>();

		numbers.stream().forEach(e -> {
			list.add(Math.sqrt(f.apply(e)));
		});

		return list;

	}
}
