package com.java8.defaultinterface.client;

import com.java8.defaultinterface.Interface1;
import com.java8.defaultinterface.impl.InterfaceImpl;

public class Client1 {
	
	public static void main(String args[]) {
		Interface1 interface1 = new InterfaceImpl();
		
		interface1.test();
	}

}
