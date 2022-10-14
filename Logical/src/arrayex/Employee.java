package arrayex;

public class Employee {

	int eno,salary;
	
	public Employee(int eno, int salary) {
		super();
		this.eno = eno;
		this.salary = salary;
	}
	
	@Override
	public String toString() 
	{
		return "eno= " + eno + " and salary = " + salary;
	}
	
	
	
}
