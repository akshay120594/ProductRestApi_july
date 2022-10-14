package com.kiranacademy.comparatorex;

import java.util.Comparator;

public class SortOnSalary implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		/* if salaries are equal then compare on eno*/
		
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		if(e1.salary.equals(e2.salary))
			return e1.eno.compareTo(e2.eno);
		
		return e1.salary.compareTo(e2.salary);
	}

}
