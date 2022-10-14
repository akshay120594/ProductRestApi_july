import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
public class ArrayListExwithStream {

	public static void main(String[] args) {
		
		List<Employee>  arrayList = new ArrayList<Employee>();
		
		Employee e1=new Employee(1,10000);
		
		arrayList.add(e1);
		
		arrayList.add(new Employee(2,20000));
		
		arrayList.add(new Employee(3,50000));
		arrayList.add(new Employee(4,60000));
		arrayList.add(new Employee(5,80000));
		
		System.out.println(arrayList);
				
		// print employees having salary greater than 50000
		
		arrayList.stream().filter(employee->employee.salary>50000).forEach(employee->System.out.println(employee));;
		
		// map(-) takes one function as a argument and applies that function on each element from stream 
		// print salaries of each employee
		
		arrayList.stream().map(employee->employee.salary).forEach(salary->System.out.println(salary));;
		
		
		// get employees having salary<50000 and increase salary by 10000
		arrayList.stream().filter(employee->employee.salary<50000).map(employee->employee.salary+10000).forEach(salary->System.out.println(salary));;
	
				
		
		// collect() will convert Stream into List . below code will remove employee objects having eno>3
		
		arrayList=arrayList.stream().filter(employee->employee.eno<=3).collect(Collectors.toList());
		
		System.out.println(arrayList);
		
		// give employee whose salary is highest
		
		System.out.println(arrayList.stream().max((e3,e4)->e3.salary.compareTo(e4.salary)));;
		
	}
	
}
