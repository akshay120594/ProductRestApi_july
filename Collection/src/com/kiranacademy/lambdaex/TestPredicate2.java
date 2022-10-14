package com.kiranacademy.lambdaex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestPredicate2 {

	public static void main(String[] args) {
	
		
//		List<Integer> list=Arrays.asList(1,2,3,4,5);// list ==> [1,2,3,4,5 stream()] List object
//		
//		Stream<Integer> stream=list.stream().filter(integer->integer%2==0);// stream ==> [[2][4] forEach()] Stream object
//		
//		stream.forEach(integer->System.out.println(integer));
//		
	Arrays.asList(1,2,3,4,5).stream().filter(integer->integer%2==0).forEach(integer->System.out.println(integer));
		
		
	
	}

}
