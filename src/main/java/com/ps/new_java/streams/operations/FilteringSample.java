package com.ps.new_java.streams.operations;

import java.util.List;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class FilteringSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		(empList.stream()
				.filter(e -> e.getFirstName().equals("Prem"))
				.filter(Employee:: isExecutive)
				.filter(Employee:: isSenior))
		.forEach(System.out::println);

	}

}
