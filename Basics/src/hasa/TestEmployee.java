package hasa;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp;// reference variable declaration
		
		emp=new Employee(1,new Phone("iphone",80000));
	
		System.out.println(emp);
		
		emp=new Employee(2,new Phone("one+",30000));
		
		System.out.println(emp);
	
	}

}
