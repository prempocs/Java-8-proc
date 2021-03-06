package com.ps.new_java.streams.operations;

import java.util.List;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class DistinctLimitSkipSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		//(empList.stream().map(Employee::getFirstName).distinct()).forEachOrdered(System.out::println);
		//(empList.stream().map(Employee::getFirstName).limit(1)).forEachOrdered(System.out::println);
		(empList.stream().map(Employee::getFirstName).skip(13)).forEachOrdered(System.out::println);

	}

}
