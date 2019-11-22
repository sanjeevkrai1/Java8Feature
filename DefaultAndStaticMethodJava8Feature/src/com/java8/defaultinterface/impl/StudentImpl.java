package com.java8.defaultinterface.impl;

import java.util.Collections;
import java.util.List;

import com.java8.defaultinterface.Sorting;

public class StudentImpl implements Sorting {

	@Override
	public Integer getMaximum(List<Integer> list) {
		return Collections.max(list);
	}

}
