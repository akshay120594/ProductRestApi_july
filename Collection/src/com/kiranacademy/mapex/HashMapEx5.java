package com.kiranacademy.mapex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx5 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,Employee> hashmap=new HashMap<Integer,Employee>();
		
		Employee employee1 = new Employee(101,100000,"sachin");
		Employee employee2 = new Employee(102,200000,"ramesh");
		Employee employee3 = new Employee(103,300000,"rahul");
		
		hashmap.put(employee1.eno, employee1);
		hashmap.put(employee2.eno, employee2);
		hashmap.put(employee3.eno, employee3);
		
		System.out.println(hashmap);
		
		Employee e = hashmap.get(102);
		e.setSalary(900000);
		
		System.out.println(hashmap);
		
		
		Collection<Employee> collection=hashmap.values();
		
		for(Employee employee : collection)
		{
			if(employee.getEname().equals("rahul"))
			{
				employee.setSalary(800000);
				break;
			}
		}
		
		
		System.out.println(hashmap);
		
		
		System.out.println(new TreeMap<Integer,Employee>(hashmap));;
		
		TreeMap treemap = new TreeMap<Integer,Employee>(hashmap);
		
		Employee employee = (Employee) treemap.get(102);
		
		System.out.println(employee.salary);
		
		
	}

}
