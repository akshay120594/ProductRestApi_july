package arrayex;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		Employee[] employees= {new Employee(1,4000),new Employee(2,3000),new Employee(3,2000),new Employee(4,1000)};

		
		for(int i=0;i<employees.length-1;i++)
		{
			for(int j=i+1;j<employees.length;j++)
			{
				if(employees[i].salary>employees[j].salary)
				{
						Employee temp;
						temp=employees[i];
						employees[i]=employees[j];
						employees[j]=temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(employees));
	}

}
