package com.kiranacademy.comparatorex;

import java.util.Scanner;
import java.util.TreeSet;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sorting on 1.eno 2.salary :-  ");
		int choice=scanner.nextInt();
		int a;
		TreeSet<Employee>  treeset;
		
		// TreeSet(Comparator c)
		// add(int a,int b)
		// add(10,20);
		if(choice==1)
				treeset=new TreeSet(new SortOnEno());
		else
				treeset=new TreeSet<>(new SortOnSalary());
		
		treeset.add(new Employee(1,2000));
		treeset.add(new Employee(3,1000));
		treeset.add(new Employee(2,2000));
		
		System.out.println(treeset);
		
		main(args);// function recursion
	}

}
