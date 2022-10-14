package com.kiranacademy.comparableex2;

public class Employee implements Comparable<Employee>
{
	
	Integer eno,salary;
	
	String ename; // sort on basis of ename
	
	
	public Employee(Integer eno, Integer salary, String ename) {
		super();
		this.eno = eno;
		this.salary = salary;
		this.ename = ename;
	}


	@Override
	public int compareTo(Employee e) 
	{
		
		return ename.compareTo(e.ename);
	}



	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + ", ename=" + ename + "]";
	}
	
	
	
}
