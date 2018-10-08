package com.ps.new_java.streams.operations;

import java.util.List;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class MappingSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		(empList.stream().map(Employee::getFirstName)
				.map(String::toUpperCase))
		.forEach(System.out::println);

	}

}
