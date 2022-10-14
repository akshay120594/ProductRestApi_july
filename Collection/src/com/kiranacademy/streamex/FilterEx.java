package com.kiranacademy.streamex;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FilterEx {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		for(Integer integer:arrayList)
		{
			if(integer%2==0)
			{
				arrayList2.add(integer);
			}
		}
		
		System.out.println(arrayList2);
	
		
		
	}

}
