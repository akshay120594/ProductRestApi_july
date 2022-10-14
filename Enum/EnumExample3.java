import java.util.ArrayList;
enum Items
{
	EMP1(new Employee(1,1000)),EMP2(new Employee(2,2000));
	
	int price;
	Employee emp1;
	
		
	Items(Employee employee) {
	    
		emp1=employee;
	}
	
	Employee getEmp1()
	{
		return emp1;
	}
	
	public static void main(String[] args) {
		
		for(Items item:Items.values())
		{
			System.out.println(item.getEmp1());
		}
	}
	
}
