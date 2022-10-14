package com.kiranacademy.streamex;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {
		
		/* use of Optional object ensure that NullPointerException would not occur */

		List<Integer>  list = Arrays.asList();// list => [1,2,3] List object
		
		Stream<Integer> stream = list.stream();//stream ==> [1,2,3] Stream object
		
		// reduce(BinaryOperator o)
		//BinaryOperator.apply(Object,Object);
		
		Optional<Integer> op=stream.reduce((number1,number2)->number1+number2);
		
		// op===>[ [6] Inetger object  ] Optional object
		
		System.out.println(op.get().intValue());// by calling isPresent() , we can avoid exception if object is not present inside Optional object .

		if(op.isPresent()) // gives true if object is present inside Optional object
		{
			Integer o = op.get();// get() will read object
			
			System.out.println(o.intValue());
		}
		else
		{
			System.out.println("It is empty");
		}
			
		
	}
}
