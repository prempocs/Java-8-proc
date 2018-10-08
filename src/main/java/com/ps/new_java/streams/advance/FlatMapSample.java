package com.ps.new_java.streams.advance;

import java.util.List;
import java.util.stream.Stream;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class FlatMapSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
//		(empList.stream().flatMap(e -> e.getTeam().stream()))
//.forEach(System.out::println);
		
		 Stream<List<Employee>> empStream=Stream.of(empList,empList);
		 empStream.flatMap(e -> e.stream()).forEach(System.out::println);
	}

}
