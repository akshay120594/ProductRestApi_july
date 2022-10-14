package com.kiranacademy.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx4 {

	public static void main(String[] args) {
		
		
		HashMap<String,Long> hashmap=new HashMap<String, Long>();
		
		hashmap.put("akshay",123L);
		hashmap.put("sachin",124L);
		hashmap.put("rajesh",125L);
		
		System.out.println(hashmap);
		
		
		Set<String> set=hashmap.keySet();// [akshay,sachin,rajesh] Set object
		
		for(String name : set)
		{
			System.out.println(name + " " + hashmap.get(name));
		}
		
		hashmap.put("suraj",145L);// new entry will be added
		hashmap.put("sachin",421L);// entry will be updated
		
		System.out.println(hashmap);
		
		hashmap.remove("suraj");
		
		System.out.println(hashmap);
		
		
		System.out.println(hashmap.get("sachin"));
		
		
	}

}
