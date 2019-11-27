package com.test.lambda.demo3;

public class Employee {

	private String employeeName;
	private int empId;

	public Employee(String employeeName, int empId) {
		super();
		this.employeeName = employeeName;
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return String.format("Employee [employeeName=%s, empId=%s]", employeeName, empId);
	}

}
