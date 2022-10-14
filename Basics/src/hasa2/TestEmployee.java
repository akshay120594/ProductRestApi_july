package hasa2;

public class TestEmployee {

	
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		
		System.out.println(phone);
		
		
		phone.setName("one+");
		phone.setPrice(40000);
		
		
		System.out.println(phone);
		
		
		Employee employee = new Employee();
		
		System.out.println(employee);
		
		
		employee.setEno(1);
		employee.setPhone(phone);
		
		System.out.println(employee);
		
		
		
		System.out.println(employee.getEno());
		
		System.out.println(employee.getPhone());
		
		
		Phone p = employee.getPhone(); 
		
		// p===> [ name=one+ price=40000  getName() getPrice() setPrice(int)] Phone object
		
		
		p.setPrice(p.getPrice() + 10000);
		
		System.out.println(p.getPrice());
		
		
		
		
		
		
	}
}
