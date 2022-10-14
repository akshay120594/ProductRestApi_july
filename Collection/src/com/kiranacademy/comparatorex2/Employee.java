package com.kiranacademy.comparatorex2;

public class Employee 
{

	Integer eno,salary;
	String ename;
	
	
	
	public Employee(Integer eno, Integer salary, String ename) {
		super();
		this.eno = eno;
		this.salary = salary;
		this.ename = ename;
	}



	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + ", ename=" + ename + "]";
	}
	
	
	
}
