package com.kiranacademy.comparablex;

import java.util.TreeSet;

public class EmployeeSorting {

	
	public static void main(String[] args) {
		
		TreeSet  treeset=new TreeSet();
		
		treeset.add(new Employee(2,2000));
		treeset.add(new Employee(1,1000));
		treeset.add(new Employee(3,1500));
		
		System.out.println(treeset);
	}
}
