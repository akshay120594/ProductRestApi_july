package com.kiranacademy.streamex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Difference {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4);
		
		list.forEach(integer->System.out.println(integer));
		
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		Stream<Integer> stream=list.stream(); // stream==>[1,2,3,4 forEach()] Stream object
		stream=stream.filter(integer->integer%2==0);// stream===>[2,4 forEach()] Stream object
		stream.forEach(integer->System.out.println(integer));
		
		// line no 22 , remove stream= 
		// Stream object can be iterated ONLY once
		
		
		
		
	}
}
