package com.kiranacademy.streamex;

import java.util.Arrays;
import java.util.List;

public class FilterWithEmployee {

	public static void main(String[] args) {
	
		List<Integer> list2=Arrays.asList(1,2,3,4,5);
		list2.stream().filter(integer->integer>2).forEach(integer->System.out.println(integer));
		
		
List<Employee> list=Arrays.asList(new Employee(1, 5000,"sachin"),new Employee(2, 3000,"sachin"),new Employee(3, 7000,"sachin"));

		list.stream().filter(employee->employee.salary>4000).forEach(employee->System.out.println(employee));

	
	
	
	}

}
