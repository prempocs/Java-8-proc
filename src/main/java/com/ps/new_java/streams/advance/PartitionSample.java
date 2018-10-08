package com.ps.new_java.streams.advance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class PartitionSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		Map<Boolean,List<Employee>> partitionedList = empList.stream().collect(Collectors.partitioningBy(Employee::isExecutive));
		Map<Boolean,Map<Boolean,List<Employee>>> partitionedandGrpByList = empList.stream().collect(Collectors.partitioningBy((Employee::isExecutive),Collectors.groupingBy(Employee::isSenior)));
		System.out.println(partitionedandGrpByList);
		partitionedandGrpByList = empList.stream().collect(Collectors.partitioningBy((Employee::isExecutive),Collectors.partitioningBy(Employee::isSenior)));
		System.out.println(partitionedandGrpByList);
	}

}
