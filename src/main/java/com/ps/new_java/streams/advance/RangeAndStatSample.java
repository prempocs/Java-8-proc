package com.ps.new_java.streams.advance;

import java.util.List;
import java.util.stream.IntStream;

import com.ps.module.Employee;
import com.ps.module.EmployeeUtil;

public class RangeAndStatSample {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeUtil.generateEmployees();
		IntStream ints = IntStream.range(1, 10);
ints.forEach(System.out::println);
ints = IntStream.rangeClosed(1, 10);
ints.forEach(System.out::println);

ints = IntStream.rangeClosed(1, 10);
System.out.println(ints.max());
System.out.println(ints.min());
System.out.println(ints.average());
System.out.println(ints.count());
System.out.println(ints.unordered());

	}

}
