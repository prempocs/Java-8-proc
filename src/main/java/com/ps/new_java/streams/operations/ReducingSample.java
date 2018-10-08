package com.ps.new_java.streams.operations;

import java.util.List;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class ReducingSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		System.out.println(
				empList.stream().map(Employee:: getFirstName). reduce((a,b) -> a+", "+b)
				
				);
		
		//System.out.println(
			//	(empList.stream().map(Employee:: getAge). reduce((a,b) -> a+b)).get()/empList.stream().count()
				
			//	);
		
		System.out.println(
				(empList.stream().map(Employee:: getAge). reduce(10, (a,b) -> a+b))
				
				);
		

	}

}
