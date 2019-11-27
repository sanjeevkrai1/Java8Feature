package com.test.lambda.demo4;

public class Client1 {

	public static void main(String args[]) {
	
		MyInterface1 interface1 = (x)->{
			if(x == 10)
				return x;
			else {
				for(int i =1 ; i < 5 ; i++) {
					x *= i;
				}
				return x;
			}
		};
	
	
		System.out.println(interface1.printNo(10));
		System.out.println(interface1.printNo(20));
		
		
		MyInterface2 myInterface2 = Client1 :: saySomeThing;
		myInterface2.say();
	
	}
	
	
	public static void saySomeThing() {
		System.out.println("Pls say something...");
	}
	
	

}
