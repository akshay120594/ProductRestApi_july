package com.kiranacademy.streamex;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import com.kiranacademy.mapex.Employee;

public class ReduceExample5 {

	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList=new ArrayList<Employee>();
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("How many objects :- ");
		int size=scanner.nextInt();
		
		for(int index=0;index<size;index++)
		{
			System.out.println("Enter eno,salary,name :-  ");
			int eno;
			int salary;
			String ename;
			
			arrayList.add(new Employee(eno=scanner.nextInt(),salary=scanner.nextInt(),ename=scanner.next()));
		}
		
		Stream<Employee> stream = arrayList.stream();//stream ==> [3 objects] Stream object
		
		Optional<Employee> op=stream.max((e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
		
		if(op.isPresent())
		{
			System.out.println(op.get());
		}
	}
}
