package com.kiranacademy.streamex;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample3 {

	public static void main(String[] args) {
		

		List<Integer>  list = Arrays.asList(1,2,3);
		
		Stream<Integer> stream = list.stream();//stream ==> [1,2,3] Stream object
		
		Optional<Integer> op=stream.min((no1,no2)->no1.compareTo(no2));
		
		if(op.isPresent())
		{
			System.out.println(op.get());
		}
	}
}
