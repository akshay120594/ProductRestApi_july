import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx6 {

	public static void main(String[] args) {
		
	
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(1,1000));
		arrayList.add(new Employee(2,2000));
		
		
		Iterator<Employee> iterator = arrayList.iterator();
		
		while(iterator.hasNext())
		{
			Employee employee =iterator.next(); // employee ==>[eno=1,salary=1000] Employee class object
			
			System.out.println(employee.eno + " " + employee.salary);
		}
		

}
}
