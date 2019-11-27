package com.test.functionalinterface;

public class Client1 {

	public static void main(String args[]) {

		Runnable r = () -> {
			System.out.println("Inside run method of functional interface");
		};

		new Thread(r).start();
	}

}
