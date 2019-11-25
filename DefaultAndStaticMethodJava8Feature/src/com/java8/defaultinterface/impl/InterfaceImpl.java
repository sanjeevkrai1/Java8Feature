package com.java8.defaultinterface.impl;

import com.java8.defaultinterface.Interface1;
import com.java8.defaultinterface.Interface2;

public class InterfaceImpl implements Interface1, Interface2{

	@Override
	public void test() {
		Interface1.super.test();
	}

}
