package com.test.custom.functionalinterface;

public class Client2 {

	public static void main(String args[]) {

		MyInterface myInterface = (x, y) -> {
			return x + y;
		};
		int addition = myInterface.add(5, 6);
		System.out.println("Addition of two no : "+addition);

		MyInterface1 myInterface1 = (str) -> {
			System.out.println("Your name is : " + str);
		};
		myInterface1.test("Sanjeev Kumar Rai");

		MyInterface3 myInterface3 = (name, age) -> {
			System.out.println("Your name is : " + name);
			System.out.println("Your age is : " + age);
		};

		myInterface3.getNameAndAge("Sanjeev Kr Rai", 33);

		MyInterface4 myInterface4 = (age) -> age > 18;
		boolean isAge = myInterface4.checkAge(55);
		System.out.println("Check age is ::: "+isAge);
	}
}
