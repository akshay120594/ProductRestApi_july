package hashmapex;

public class Employee {
	
	int eid,salary;
	String ename;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", ename=" + ename + "]";
	}


	public Employee(int eid, int salary, String ename) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.ename = ename;
	}
	
	
	
	

}
