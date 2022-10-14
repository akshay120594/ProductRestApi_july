package arrayex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray3 {

	public static void main(String[] args) {
		
		//List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		 
//		ArrayList<String> al=new ArrayList();
//		al.add("Larry");
//		al.add("Moe");
//		al.add("Curly");
		
	List<Employee>  arrayList=Arrays.asList(new Employee(1,4000),new Employee(2,3000),new Employee(3,2000),new Employee(4,1000));
		
//		ArrayList<Employee> arrayList=new ArrayList<>();
//		arrayList.add(new Employee(1,4000));
//		arrayList.add(new Employee(2,3000));
//		arrayList.add(new Employee(3,2000));
//		arrayList.add(new Employee(4,1000));
		
		Employee e1;
		Employee e2;
				
		for(int i=0;i<arrayList.size()-1;i++)
		{
		
			for(int j=i+1;j<arrayList.size();j++)
			{
				
				if(arrayList.get(i).salary>arrayList.get(j).salary)
				{
					System.out.println("swapping objects");
					Employee temp;
					temp=arrayList.get(i);
					//arrayList.get(i)=arrayList.get(j);
					arrayList.set(i,arrayList.get(j));
					arrayList.set(j,temp);
					
					// set(int index,Employee employee) is used to update(replace) object present at particular index
						
				}
			}
			
			
		}
		
		
		System.out.println(arrayList);
	}

}
