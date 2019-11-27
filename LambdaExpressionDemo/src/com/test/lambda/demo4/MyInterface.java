package com.test.lambda.demo4;

import java.util.Collections;
import java.util.List;

@FunctionalInterface
public interface MyInterface {
	public void displayList(List<Employee> list);

	default List<Employee> sortEmployee(List<Employee> list) {
		Collections.sort(list);
		return list;
	}

	public static boolean isNull(List<Employee> list) {
		return list.isEmpty();
	}
}
