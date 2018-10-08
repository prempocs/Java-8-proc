package com.ps.module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {
	public static List<Employee> generateEmployees() {
		Employee manager = new Employee(1, "Prem", "Rohan", "prem@in.com", "9980760203", null, new ArrayList<>(),55);
		List<Employee> empList =  new ArrayList<Employee>();
				
		List<Employee> team = 	Arrays.asList(
				new Employee(2, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),21),
				new Employee(3, "Vikramaditya", "Prakash", "vkm@in.com", "9980760203", manager, new ArrayList<>(),48),
				new Employee(4, "Manisha", "Bharti", "MB@in.com", "9980760203", manager, new ArrayList<>(),49),
				new Employee(5, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),48),
				new Employee(6, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),51),
				new Employee(7, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),55),
				new Employee(8, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),43),
				new Employee(9, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),20),
				new Employee(10, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),22),
				new Employee(11, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),55),
				new Employee(12, "Ishi", "Prakash", "Ishi@in.com", "9980760203", manager, new ArrayList<>(),21));
		manager.getTeam().addAll(team);
		empList.add(manager);
		empList.addAll(team);
		if(empList.size()>12) throw new RuntimeException("Not Correct list");
		return empList;
	}
}
