import java.io.Serializable;

/*
   1. Transient Object :- object whose data is not stored anywhere 
   2. Persistent object :-  object whose data is stored somewhere (file/database/cloud)
   
   Serializable is a marker interface means it does not contains any method . It is empty interface . 
   
   Clonable is also marker interface .
   
   marker interfaces are also called tagging interface .
   
 *  */
public class Employee implements Serializable {

	public static final long serialVersionUID=101;
	
	int eno;
	int salary; // transient variable's value is not stored in a file

	Employee()
	{
		
	}
	
	public Employee(int eno, int salary) {
		super();
		this.eno = eno;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + "]";
	}
	
	
	void show()
	{
		
	}
}



