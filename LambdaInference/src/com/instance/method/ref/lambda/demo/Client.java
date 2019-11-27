package com.instance.method.ref.lambda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Client {

	public static void main(String args[]) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Sanjeev", "45"));
		persons.add(new Person("Mrinal", "35"));
		persons.add(new Person("Vikas", "32"));
		persons.add(new Person("Peeyush", "36"));

		List<String> newList = Client.getPersonListByName(persons, Person::getName);

		newList.stream().forEach(System.out::println);
	}

	private static List<String> getPersonListByName(List<Person> persons, Function<Person, String> f) {
		List<String> lst = new ArrayList<String>();

		persons.forEach(e -> {
			lst.add(f.apply(e));
		});
		return lst;
	}
}
