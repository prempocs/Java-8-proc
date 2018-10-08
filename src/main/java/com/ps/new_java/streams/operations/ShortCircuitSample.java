package com.ps.new_java.streams.operations;

import java.util.List;
import java.util.stream.Collectors;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class ShortCircuitSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		System.out.println(((empList.stream(). collect(Collectors.toSet()).stream().filter(Employee::isSenior).findFirst()).get()));
		System.out.println(empList.stream().anyMatch(e -> e.getFirstName().equalsIgnoreCase("ishi")));
		System.out.println(empList.stream().anyMatch(e -> e.getFirstName().equalsIgnoreCase("ish")));
		System.out.println(empList.stream().allMatch(e -> e.getFirstName().equalsIgnoreCase("ishi")));// all entry will have this value
		System.out.println(empList.stream().noneMatch(e -> e.getFirstName().equalsIgnoreCase("ishiq")));//none of any have this
		 
		
	}

}
