package com.ps.new_java.streams.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class OptionalTwoSample {
	List<Employee> empList = EmployeeUtil.generateEmployees();
	
	public static void main(String[] args) {
		Employee manager1 = new Employee(1, "Prem", "Rohan", "prem@in.com", "9980760203", null, new ArrayList<>(),55);
		Optional<Employee> empOptional = Optional.of(manager1);
		System.out.println(empOptional.get());
		Employee  manager = null;
		Optional<Employee> empOptionalNullable = Optional.ofNullable(manager);
		System.out.println(empOptionalNullable);
		empOptionalNullable.ifPresent(System.out::println);
		System.out.println(empOptionalNullable.orElse(manager1).getFirstName());
		System.out.println(empOptional.orElse(manager).getFirstName());
		
		try {
			empOptionalNullable.orElseThrow(Exception::new);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
