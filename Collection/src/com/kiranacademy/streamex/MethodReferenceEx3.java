package com.kiranacademy.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReferenceEx3 {
	
	public static void main(String[] args) {
		
		int eno;
		int salary;
		String ename;
		List<Employee> list=Arrays.asList(new Employee(eno=1, salary=1000, ename="abc"),new Employee(2, 2000, "xyz"),new Employee(3, 3000, "pqr"));
		list.stream().map(employee->employee.getEname()).forEach(System.out::println);
		
	}

}

