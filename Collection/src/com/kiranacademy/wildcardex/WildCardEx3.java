package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class WildCardEx3 {
	
	static void show(ArrayList<? extends Object> arrayList)
	{
		// All classes will work here as every class extends Object class
	}
	
	public static void main(String[] args) {
				
		ArrayList<Exception> arrayList2 = new ArrayList<Exception>();
	    	
		show(arrayList2);
		
		ArrayList<NullPointerException> arrayList3 = new ArrayList<NullPointerException>();
    	
		show(arrayList3);
		
	}

}
