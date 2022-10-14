package com.kiranacademy.streamex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterEx2 {

	public static void main(String[] args) {
		
		
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		
//		//boolean java.util.function.Predicate.test(T t)	
//		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4); 
		
		
		
	//arrayList.forEach(integer->System.out.println(integer));
		
//		Stream<Integer> stream = arrayList.stream(); 
//		
//		// stream ===> [filter(),map(),reduce()] Stream interface object
//		
//		Stream<Integer> stream2=stream.filter(integer->integer%2==0);
//		
//		// stream2 ==> [ 2,4 forEach(),map(),reduce() ] Stream object given by filter()
//		
//		stream2.forEach(integer->System.out.println(integer));
		
		Arrays.asList(1,2,3,4).stream().filter(integer->integer%2==0).forEach(integer->System.out.println(integer));
		
		
		String s1="Kiran";
		int len= s1.concat("academy").length();
		System.out.println(len);
		
//		Stream<Integer> stream3 = arrayList.stream();
//		
//		stream3.filter(new Predicate<Integer>() 
//		{
//
//			@Override
//			public boolean test(Integer integer) 
//			{
//				return integer%2==1;
//			}
//		}).forEach(System.out::println);;
//		
//		// interface Consumer
//		// {
//				// void accept(Object o);
//		// }
//		
//		// forEach(Consumer)
//		// forEach(integer->System.out.println(integer));
//		
//		/*
//			class A implements Consumer<Integer>
//			{
//						void accept(Integer integer)
//						{
//							System.out.println(integer);
//						}
//			}
//		
//		 */
		
	}

}
