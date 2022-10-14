package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class WildCardEx2 {
	
	static void show(ArrayList<? super RuntimeException> arrayList)
	{
		// Exception is a super class of RuntimeException
	}
	
	public static void main(String[] args) {
				
		ArrayList<Exception> arrayList2 = new ArrayList<Exception>();
	    	
		show(arrayList2);
		
		ArrayList<NullPointerException> arrayList3 = new ArrayList<NullPointerException>();
    	
		show(arrayList3);
		
	}

}
