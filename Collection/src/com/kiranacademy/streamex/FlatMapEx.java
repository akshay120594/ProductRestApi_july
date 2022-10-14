package com.kiranacademy.streamex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapEx {

	public static void main(String[] args) {
		
				
		List<Integer> list1= Arrays.asList(10,20,30);
		List<Integer> list2= Arrays.asList(40,40,60);
		List<Integer> list3= Arrays.asList(70,80,90);
		
		
		List<List<Integer>> listoflist = Arrays.asList(list1,list2,list3);
		
		
		listoflist.stream().flatMap(list->list.stream()).forEach(element->System.out.println(element));

		
		List<List<Integer>> listoflist2 = Arrays.asList(list1,list2,list3);
			
		listoflist2.stream().forEach(element->System.out.println(element));
		
		/* flatmap combines multiple list and create single list and then return Stream object  */
	}

}
