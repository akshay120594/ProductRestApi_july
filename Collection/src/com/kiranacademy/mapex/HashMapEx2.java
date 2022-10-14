package com.kiranacademy.mapex;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		
		
		HashMap<String,Long> hashmap=new HashMap<String, Long>();
		
		hashmap.put("akshay",123L);
		hashmap.put("sachin",124L);
		hashmap.put("rajesh",125L);
		
		System.out.println(hashmap);
		
		Set<Entry<String,Long>> set=hashmap.entrySet();
		
		for(Entry<String,Long> entry : set)
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		
		
	}

}
