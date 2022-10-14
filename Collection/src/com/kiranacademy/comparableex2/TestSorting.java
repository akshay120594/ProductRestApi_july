package com.kiranacademy.comparableex2;

import java.util.TreeSet;

class TestSorting{

	public static void main(String[] args) {
		
TreeSet  treeset=new TreeSet();
Employee e1=new Employee(2,2000,"ramesh");

		treeset.add(e1);
		treeset.add(new Employee(1,1000,"amit"));
		treeset.add(new Employee(3,1500,"amit"));
		
		System.out.println(treeset);
	}

	}
