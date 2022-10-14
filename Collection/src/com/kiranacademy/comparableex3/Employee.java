package com.kiranacademy.comparableex3;

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

	// -3 -2 -1 0 1 2 3
	@Override
	public int compareTo(Employee e) 
	{
		if(salary>e.salary)
			return 4;
		else if(salary<e.salary)
			return -5;
		else
			return eno.compareTo(e.eno);
				
	}
	
	
}
