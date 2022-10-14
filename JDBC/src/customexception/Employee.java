package customexception;

public class Employee {
	
	int eid,salary;
	String ename;
	
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", ename=" + ename + "]";
	}

	
	
}
