package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class WildCardEx5 {
	
	//when we use wildcard (?) along with interface , then extends keyword replaces implements keyword
	
	static void show(ArrayList<? extends Comparable> arrayList)
	{
		// All classes will work here as every class extends Object class
	}
	
	public static void main(String[] args) {
				
		ArrayList<Integer> arrayList2 = new ArrayList<>();
	    	
		show(arrayList2);
		
		ArrayList<String> arrayList1 = new ArrayList<>();
    	
		show(arrayList1);
		
		
	}

}
