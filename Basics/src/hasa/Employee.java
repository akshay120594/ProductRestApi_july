package hasa;

public class Employee 
{
	
	int eno; // primitive variable
	Phone phone; // non-primitive variable (reference variable)
	
	public Employee(int eno, Phone phone) {
			
		this.eno = eno;
		this.phone = phone;
	}

	@Override
	public String toString() {
		
		String data="eno= " + eno + " phone= " + phone;
		
		return data;
		
	}
		
}
