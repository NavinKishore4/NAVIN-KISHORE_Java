package com.qn1;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 946169446503819916L;
	String employeeId;
	String employeeName;
	String employeePhone;
	String employeeAddress;
	int employeeSalary;

	public Employee(String employeeId, String employeeName, String employeePhone, String employeeAddress,
			int employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone="
				+ employeePhone + ", employeeAddress=" + employeeAddress + ", employeeSalary=" + employeeSalary + "]";

	}
}
