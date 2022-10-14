package com.kiranacademy.comparatorex2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Employee> treeset = new TreeSet<Employee>(new SortOnLength());
			
		treeset.add(new Employee(3,2000,"Pune"));
		treeset.add(new Employee(2,1000,"Kiran"));
		treeset.add(new Employee(1,2000,"Pune"));
		treeset.add(new Employee(4,3000,"Java"));
		
		System.out.println(treeset);
		
		
		
		TreeSet<String> treeset2 = new TreeSet<String>(new SortDescneding());

		treeset2.add("java");
		treeset2.add("kiranacademy");
		treeset2.add("pune");
		
		System.out.println(treeset2);
	}
	
	
	

}// class ends



/* to sort String objects in descending order */


class SortDescneding implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
}
