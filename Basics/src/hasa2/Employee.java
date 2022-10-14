package hasa2;



public class Employee {

	
	int eno; // primitive variable
	Phone phone; // non-primitive variable (reference variable)
	
	
	
	public int getEno() {
		return eno;
	}



	public void setEno(int eno) {
		this.eno = eno;
	}



	public Phone getPhone() {
		return phone;
	}



	public void setPhone(Phone phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		
		String data="eno= " + eno + " phone= " + phone;
		
		return data;
		
	}
		
}
