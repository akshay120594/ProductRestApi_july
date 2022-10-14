package com.kiranacademy.mapex;

import java.util.HashMap;

/* If 2 object's contents are equals, then their hashcode must be equal. so that
 * Hashmap will consider them as duplicate keys . But for this , that class must have overriden
 *  equals() and hashcode()
 *  */
public class EqualsHashCodeRequirement {

	public static void main(String[] args) {
		
		HashMap<Employee,String>  hashmap = new HashMap<Employee, String>();
		
		Employee e1=new Employee(1,1000,"xyz");
		Employee e2=new Employee(1,1000,"xyz");
	
	// If contents are equal then hashcode must be equal. for this override equals() and hashcode() both methods
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode() + " " + e2.hashCode());
		hashmap.put(e1,"kiran");
		hashmap.put(e2,"academy");
		
		System.out.println(hashmap);
	}
}
// If equals() returns true check hashcode() ( contents same/hashcode same -ONLY one)

// If equals() returns false DO NOT CHECK hashcode()(both will be taken irrespective of hashcode