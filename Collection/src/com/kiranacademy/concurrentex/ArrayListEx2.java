package com.kiranacademy.concurrentex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.lang.System.out;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		
		System.out.println(out.getClass());
		
		// CopyOnWriteArrayList is synchronized(Thread Safe) .
		
CopyOnWriteArrayList<Integer>  arrayList = new CopyOnWriteArrayList<Integer>();
		
		//ArrayList<Integer>  arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		
		
		Iterator<Integer> iterator = arrayList.iterator();
		
		while(iterator.hasNext())
		{
			Integer i=iterator.next();
			if(i==20)
			arrayList.remove(i);
				
		// If we remove() of ArrayList while iterating elements then we get ConcurrentModificationException
		
		}
		
		System.out.println(arrayList);
	}

}
