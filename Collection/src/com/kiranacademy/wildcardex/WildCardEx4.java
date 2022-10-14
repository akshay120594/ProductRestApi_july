package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class WildCardEx4 {
	
	// show(ArrayList<?> arrayList)
	// show(ArrayList<? extends Object> arrayList)
	// Both are same
	
	static void show(ArrayList<?> arrayList)
	{
		// All classes will work 
	}
	
	public static void main(String[] args) {
				
		ArrayList<Exception> arrayList2 = new ArrayList<Exception>();
	    	
		show(arrayList2);
		
		ArrayList<NullPointerException> arrayList3 = new ArrayList<NullPointerException>();
    	
		show(arrayList3);
		
	}

}
