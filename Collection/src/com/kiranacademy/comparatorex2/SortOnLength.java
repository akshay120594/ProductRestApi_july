package com.kiranacademy.comparatorex2;

import java.util.Comparator;
//xyz
//xyz
public class SortOnLength implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		
		Integer len1 = e1.ename.length();
		Integer len2 = e2.ename.length();
			
		if(e1.ename.equals(e2.ename))
			return e1.eno.compareTo(e2.eno); // if enames are equals compare by eno
		
		else if(len1.equals(len2))
			return e1.ename.compareTo(e2.ename);// if lengths are equals compare by ename(alphabatical)
		
		else
			return len1.compareTo(len2);// otherwise sort by length of ename
	}

}

