package com.kiranacademy.collectioniternalex;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapIternals2 {

	public static void main(String[] args) {

//		String s1="FB";
//		String s2="Ea";
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//
//		HashMap<String,Integer> hashmap=new HashMap<String, Integer>();
//		
//		hashmap.put(s1, 10);
//		
//		hashmap.put(s2, 20);
//		
//		
//		hashmap.put(null, 20);
//		hashmap.put(null, 30);
//
//		
//		
//System.out.println(hashmap);
//
//hashmap.get(10);


Student obj1=new Student(1,90);
Student obj2=new Student(1,80);

System.out.println(obj1.hashCode() + "  " + obj2.hashCode());

System.out.println(obj1.equals(obj2));


HashMap<Student,Integer> hashmap2=new HashMap<Student, Integer>();

hashmap2.put(obj1, 10);

hashmap2.put(obj2, 20);

System.out.println(hashmap2);







	}

}
