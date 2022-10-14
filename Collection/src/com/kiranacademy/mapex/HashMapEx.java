package com.kiranacademy.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {

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
		
		//iterator ==> [hashNext(),next(),remove()] Iterator object
		
		Iterator<String> iterator=set.iterator();
		
		while(iterator.hasNext())
		{
			String s = iterator.next();
			System.out.println(s + hashmap.get(s));
		}
		
		
	}

}
