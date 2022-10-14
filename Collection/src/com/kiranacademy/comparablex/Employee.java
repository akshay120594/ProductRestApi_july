package com.kiranacademy.comparablex;

public class Employee implements Comparable<Employee>
{

	Integer eno,salary;
	
	public Employee(int eno, int salary) {
		super();
		this.eno = eno;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) 
	{
		
		return salary.compareTo(e.salary);
				
	}
	
	
}
