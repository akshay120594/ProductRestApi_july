package com.kiranacademy.lambdaex;

import java.util.Scanner;
import java.util.TreeSet;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sorting on 1.eno 2.salary :-  ");
		int choice=scanner.nextInt();
		
		TreeSet<Employee>  treeset=null;
		
		
		// TreeSet(Comparator c)
		// interface Comparator { int compare(Employee e1,Employee e2)}
		
		if(choice==1)
			treeset=new TreeSet<>((e1,e2)-> e1.eno.compareTo(e2.eno));
		else
			treeset=new TreeSet<>((e1,e2)-> e1.salary.compareTo(e2.salary));
		
		// we pass lambda expression as a argument
		// generally , Comparable object is not passed as a argument
		// however , we pass Comparator object as a argument . Hence Comparable
		// is not declared as a functional interface .
		// Comparator is declared as a functional interface even though
		// it contains 2 abstract methods . here equals() from Comparator
		// interface do not require implemenation as it gets implemenation
		// from Object class
		
		treeset.add(new Employee(1,2000));
		treeset.add(new Employee(3,1000));
		treeset.add(new Employee(2,3000));
		
		System.out.println(treeset);
		
		main(args);
		
	}

}
