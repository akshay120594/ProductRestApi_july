package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class WildCardEx1 {
	
	/* while declaring argument ONLY , ? (wildcard) is used */
	
	static void show(ArrayList<? extends Number> arrayList)
	{
		// Integer and Float will work as they are child classes of Number
	}
	
	public static void main(String[] args) {
				

		// only those class's objects are allowed , who are child class of Number class
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
	    	
		show(arrayList2);// only those class's objects are allowed , who are child class of Number class
		
		ArrayList<Float> arrayList3 = new ArrayList<Float>();
    	
		show(arrayList3);
		
		ArrayList<String> arrayList4= new ArrayList<String>();
	    
		show(arrayList4);// String does not extends Number . Hence not allowed .
		
		
//		ArrayList arrayList4 = new ArrayList();
//		arrayList4.add(10);
//		arrayList4.add("JBK");
//		
//		show(arrayList4);
		
	}

}
