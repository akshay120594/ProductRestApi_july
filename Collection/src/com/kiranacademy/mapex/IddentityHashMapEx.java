package com.kiranacademy.mapex;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IddentityHashMapEx {
	
public static void main(String[] args) {
	
	// IdentityHashMap consider address for checking duplicate keys
	// HashMap consider equals() and hashcode() for checking duplicate keys
	
	HashMap<Integer,String> hashmap = new HashMap<Integer, String>();
		
		Integer i1=new Integer(101);// i1(1000) ==> [101] Integer class object at address 1000
		Integer i2=new Integer(101);// i2(2000) ==> [101] Integer class object at address 2000
		
		System.out.println(i1.hashCode() + " " + i2.hashCode());
		
		hashmap.put(i1,"kiran");
		hashmap.put(i2,"academy");
		
		System.out.println(hashmap);//{101=academy}
		
		// If 2 object's contents are equal, then their hashcode must be equal. but for this 
		// equals() and hashcode() both methods must be overriden.HashMap uses this equals() and
		// hashcode() methods to decide duplicate keys . e.g. in above case HashMap would consider
		// i1 and i2 as duplicates as their hashcode is same as contents are same . Integer class
		// has overriden equals() and hashcode() both methods
	
		
		// Only that class is eligible as a key for hashmap , who has overriden equals()
		// and hashcode() methods . Hence String class , Integer class are eligible as a 
		// key of HashMap but Employee class is not as it has not overriden equals()
		// and hashcode() methods 
		
	}

}
