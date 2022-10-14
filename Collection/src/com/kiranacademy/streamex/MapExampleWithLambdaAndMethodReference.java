package com.kiranacademy.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExampleWithLambdaAndMethodReference {
	
	public static void main(String[] args) {
		// map accepts function as a argument and apply that function on each element from stream
		// lambda expression is used to define new functionality
		// method reference is used to reuse predefine functionality

		List<String> list=Arrays.asList("Java","Angular","HTML","CSS");
		
		Stream<String> stream=list.stream();
		
		Stream<Integer> strem2=stream.map(string->string.length()*2);
		
		strem2.forEach(integer->System.out.println(integer));
		
		System.out.println("using method reference");
		
List<String> list2=Arrays.asList("Java","Angular","HTML","CSS");
		
		Stream<String> stream2=list2.stream();
		
		Stream<Integer> strem3=stream2.map(String::length);
		
		strem3.forEach(integer->System.out.println(integer));
	}

}
