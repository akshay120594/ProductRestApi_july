package com.kiranacademy.collectioniternalex;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapIternals {

	public static void main(String[] args) {

		Integer i1=new Integer(10);
		
		System.out.println(i1.hashCode());

		Integer i2=new Integer(10);
		System.out.println(i2.hashCode());
		
		
		HashMap<Integer,Integer> hashmap=new HashMap<Integer, Integer>();
		
		hashmap.put(i1, 10);
		hashmap.put(i2, 10);
		hashmap.put(null, 20);
		hashmap.put(null, 30);

		
System.out.println(hashmap);

hashmap.get(10);




	}

}
