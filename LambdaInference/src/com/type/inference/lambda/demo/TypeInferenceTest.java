package com.type.inference.lambda.demo;

public class TypeInferenceTest {

	public static void main(String args[]) {
		MyCompare myInterface = (x , y)->x>y;
		System.out.println(myInterface.compare(5, 4));
	}
}
