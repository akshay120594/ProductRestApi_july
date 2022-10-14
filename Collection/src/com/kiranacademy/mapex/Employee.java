package com.kiranacademy.mapex;

import java.util.Objects;
import java.util.Random;

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



	public Integer getEno() {
		return eno;
	}



	public void setEno(Integer eno) {
		this.eno = eno;
	}



	public Integer getSalary() {
		return salary;
	}



	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	@Override
	public int hashCode() {
		return Objects.hash(ename, eno, salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(ename, other.ename) && Objects.equals(eno, other.eno)
				&& Objects.equals(salary, other.salary);
	}



		
	
	
	
	
}
