package com.kiranacademy.streamex;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import com.kiranacademy.mapex.Employee;

public class ReduceExample6 {

	public static void main(String[] args) {
		
		List<Employee>  list = Arrays.asList(new Employee(1,1000,"c"),new Employee(2,2000,"b"),new Employee(3,3000,"a"));
		
		Stream<Employee> stream = list.stream();//stream ==> [3 objects] Stream object
		
		Optional<Employee> op=stream.max((e1,e2)->e1.getEname().compareTo(e2.getEname()));
		
		if(op.isPresent())
		{
			System.out.println(op.get());
		}
	}
}
