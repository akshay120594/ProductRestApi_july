import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx5 {

	public static void main(String[] args) {
		
		ArrayList<Employee>  arrayList = new ArrayList<Employee>();
		
		Employee e1=new Employee(1,1000);
		
		arrayList.add(e1);
		
		arrayList.add(new Employee(2,2000));
		
		System.out.println(arrayList);
				
		for(Employee employee:arrayList)
		{
			System.out.println(employee);
		}
		
		
		
		
		//arrayList.get(0).salary=70000;
		
		Employee emp = arrayList.get(0);
		emp.salary=70000;
		
		//arrayList.set(0,new Employee(1,70000));
		

		Iterator iterator=arrayList.iterator();
		
		while(iterator.hasNext())
		{
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
		
		
		for(int index=0;index<arrayList.size();index++)
		{
			System.out.println(arrayList.get(index));
			// arrayList[index]
		}
		
		/*
		public interface Consumer {

		    void accept(Object o);
		  
		  }

		    */
		
		arrayList.forEach(employee->System.out.println(employee));// using lambda expression
		
		/*
				class A implements Consumer<Employee>
				{
						public void accept(Employee employee)
						{
							System.out.println(employee)
						}
				}
				
				forEach(Consumer c)
		*/
		
		arrayList.forEach(System.out::println);// method reference
	}
	
}
