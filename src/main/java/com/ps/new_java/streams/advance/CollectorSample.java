package com.ps.new_java.streams.advance;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class CollectorSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		Supplier<StringBuilder> supplier = StringBuilder::new;
		BiConsumer<StringBuilder, Employee> accumulator = (sb,employee) -> sb.append(sb.toString().contains(employee.getFirstName())?null:employee.getFirstName()).append(",");
		BiConsumer<StringBuilder, StringBuilder> combiner = (s1,s2) -> s1.append(s2.toString());
		System.out.println(empList.stream().collect(supplier, accumulator, combiner));
		
		
		IntSummaryStatistics s = empList.stream().collect(Collectors.summarizingInt(Employee::getAge));
		System.out.println(s);
	
	} 

}
