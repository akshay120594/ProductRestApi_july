package com.kiranacademy.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx3 {

	public static void main(String[] args) {
		
		
		HashMap<String,Long> hashmap=new HashMap<String, Long>();
		
		hashmap.put("akshay",123L);
		hashmap.put("sachin",124L);
		hashmap.put("rajesh",125L);
		
		System.out.println(hashmap);
		
		Set<Entry<String,Long>> set=hashmap.entrySet();
		
		Iterator<Entry<String,Long>> iterator=set.iterator();
		
		while(iterator.hasNext())
		{
			Entry<String,Long> entry=iterator.next();
			
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		
		
	}

}
