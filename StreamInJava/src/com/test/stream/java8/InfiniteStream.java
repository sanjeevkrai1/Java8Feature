package com.test.stream.java8;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String args[]) {
		Supplier<UUID> randomUUIDSupplier = UUID::randomUUID;
		//Stream.generate(randomUUIDSupplier).forEach(System.out::println); // this will generate infinte UUID from stream
		List<UUID> listOfUUID = Stream.generate(randomUUIDSupplier).limit(10).collect(Collectors.toList());
		listOfUUID.forEach(System.out::println);
	}

}
