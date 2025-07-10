package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryPerDepartment {

	public static void main(String[] args) {
		List<Employee> staff = Arrays.asList(
				new Employee("deptA",33000),
				new Employee("deptB",44000),
				new Employee("deptC",55000),
				new Employee("deptA",30000),
				new Employee("deptB",40000),
				new Employee("deptC",50000)
				
				);
		
		
		Map<String,Double> avgSalaryDept = staff.stream()
				.collect(Collectors.groupingBy(emp ->emp.getDept(),
						Collectors.collectingAndThen(Collectors.averagingDouble(emp -> emp.getSalary()), avg -> (avg*100)/100)));
		System.out.println(avgSalaryDept);
		
		
	}
	

}
