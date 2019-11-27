package com.test.lambda.demo1;

public class ClientDemo1 {
	
	public static void main(String args[]) {
		MyInterface myInterface = (x , y) -> x>y;
		System.out.println(myInterface.test(10 , 15));
	}

}
