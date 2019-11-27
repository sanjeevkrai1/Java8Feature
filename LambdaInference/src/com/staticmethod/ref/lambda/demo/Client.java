package com.staticmethod.ref.lambda.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	public static void main(String args[]) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Runnable r = Client::execute;

		executorService.execute(r);
		executorService.shutdown();

	}

	public static void execute() {
		System.out.println("Progream is getting executed...");
	}
}
