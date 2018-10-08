package com.ps.new_java.streams.advance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class GroupingSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		Map<Object,List<Employee>> employees = empList.stream().collect(
				Collectors.groupingBy(e -> e.isExecutive()));
		//System.out.println(employees);
		employees.values().stream().forEachOrdered(System.out:: println);
		Map<Object,Map<Object,List<Employee>>> emps = empList.stream().collect(
				Collectors.groupingBy(e -> e.isExecutive() ,Collectors.groupingBy(e -> e.isSenior())));
	
		System.out.println(emps);
	}

}
