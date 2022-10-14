import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*define Employee class with 2 fields(eno,salary). add Parameterized constructor and toString().
Store 5 Employee class objects in ArrayList
1) Iterate ArrayList object using for loop , for each loop and Iterator
2) Display only those employee objects whose salary is greater than 50000
3) Increase salary of those employees , whose salaries are less than 50000 , by 10000.
4) Remove those employee objects whose eno is greater than 3;
5) Display eno and salary of that employee whose salary is greatest .
6) Display eno and salary of those employees whose salary is greater than average salary .
7) Sort employee objects based on salary . 
*/
public class ArrayListEx5 {

	public static void main(String[] args) {
		
		ArrayList<Employee>  arrayList = new ArrayList<Employee>();
		
		Employee e1=new Employee(1,10000);
		
		arrayList.add(e1);
		
		arrayList.add(new Employee(2,20000));
		
		arrayList.add(new Employee(3,50000));
		arrayList.add(new Employee(4,60000));
		arrayList.add(new Employee(5,80000));
		
		System.out.println(arrayList);
				
		System.out.println("\n using for each loop :--  ");
		
		for(Employee employee:arrayList)
		{
			System.out.println(employee);
		}
		
		System.out.println("\n using Iterator :--  ");
		
		Iterator iterator=arrayList.iterator();
		
		while(iterator.hasNext())
		{
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
				
		System.out.println("\n using for loop :--  ");
		
		for(int index=0;index<arrayList.size();index++)
		{
			System.out.println(arrayList.get(index));
			// arrayList[index]
		}
		
		System.out.println("\n print employees whose salary greater than 50000 :--  ");
		
		for(Employee employee:arrayList)
		{
			if(employee.salary>50000)
				System.out.println(employee);
		}
		
		
		System.out.println("\n increase salary of those employees whose salary less than 50000 :--  ");
		
		for(Employee employee:arrayList)
		{
			if(employee.salary<50000)
				employee.salary=employee.salary+10000;
		}
		
		System.out.println(arrayList);
		
		/* ArrayList is not Thread Safe object . If we try to UPDATE ArrayList while
		 * iteration , then we get inconsistent result
		 *  */
		
System.out.println("\n remove employees having eno>3 :--  ");

	Iterator<Employee> iterator2 = arrayList.iterator();
	while(iterator2.hasNext())
	{
		Employee employee =iterator2.next();
		if(employee.eno>3)
			iterator2.remove(); // call remove() of Iterator interface and NOT Collection's remove()
	}
	
	System.out.println(arrayList);
		
//
//// creating temporary arraylist to store objects which we want to remove
//
//ArrayList<Employee> employeestoremove = new ArrayList<>();
//
//		for(Employee employee:arrayList)
//		{
//			if(employee.eno>3)
//				employeestoremove.add(employee);//4,5
//		}
//		
//		//Child c = new Parent(); this is wrong
//		// Parent c = new Child();
//	
//		// instead of ArrayList , we are iterating array which we got from toArray()
//		
//		for(Object employee : employeestoremove.toArray())
//		{
//			System.out.println(employee);
//			arrayList.remove(employee);
//		}
//		
//		System.out.println(arrayList);
//		
//		
//	Object[] o= {1,2.5,"dd",new Employee(1,90000)};
	
		
	/* display employee with highest salary*/
	
	
	int max=0;//50000
	int maxeno=0;//3
	
	
	for(Employee employee:arrayList)
	{
		if(employee.salary>max)
		{
			max=employee.salary;
			maxeno=employee.eno;
		}
	}
	
	
	System.out.println(maxeno + " is having highest salary " + max);

	
	
	/* display employee having salary greater than average salary */
	
	int sum=0;//80000
	
	for(Employee employee:arrayList)
	{
		sum=sum + employee.salary;
	}
			
	int averagesal=sum/arrayList.size();
	
	System.out.println(averagesal);
	
	for(Employee employee:arrayList)
	{
		if(employee.salary>averagesal)
			System.out.println(employee);
	}
	
	
	
	}
	
	
}
