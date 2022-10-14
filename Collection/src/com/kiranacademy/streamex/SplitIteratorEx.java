package com.kiranacademy.streamex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorEx {

	public static void main(String[] args) {
		
		// SplitIterator divides ( splits ) list into smaller parts .
		// Then this parts are processed in parallel .
		
		List<Integer> al = Arrays.asList(1,2,3,4);
		
		Spliterator<Integer> splitIterator=al.spliterator();
		
		splitIterator.forEachRemaining(System.out::println);
		
		
		Iterator<Integer> iterator=al.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
				
		
	}
}
