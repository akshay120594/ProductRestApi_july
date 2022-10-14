package customexception;


public class Employee {
	
	@Id
	public int eid;
	public int salary;
	public String ename;
	
	public Employee()
	{
		
	}
	
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

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	
	
	
}
