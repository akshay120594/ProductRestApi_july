package com.kiranacademy.streamex;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapEx1 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		//arrayList.forEach(integer->System.out.println(integer));
		//arrayList.forEach(integer->System.out.println(integer));
			
		Stream<Integer> stream = arrayList.stream();
		
		//stream.forEach(integer->System.out.println(integer));
		
		stream = arrayList.stream();//[1,2,3]
		
		System.out.println(stream.map(integer->integer*integer).filter(integer->integer>1).reduce((a,b)->a*b));;
			
		
		// map accepts function as a argument and apply that function on each element from stream
		
		
		//arrayList.stream().forEach(integer->System.out.println(integer)); // stream==>[1,2] Stream object
		
		//arrayList.stream().map(integer->integer*integer).forEach(integer->System.out.println(integer));; //stream==>[1,2] Stream object
		
		
		
		
	
		
		
	}

}
