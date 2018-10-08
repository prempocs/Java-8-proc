package com.ps.new_java.streams.operations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class CollectingSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		(empList.stream()
				. collect(Collectors.toList()))
		.forEach(System.out::println);
		(empList.stream(). collect(Collectors.toSet())).forEach(System.out::println);
		Map<Integer,Employee> empMap =empList.stream()
				. collect(Collectors.toMap(Employee::getId, 
						employee -> employee));
		System.out.println(empMap);
		 

	}

}
