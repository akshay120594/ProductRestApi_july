package com.kiranacademy.streamex;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//[1,2,3]
// we wanted square of these elements
// we define new functionality using lambda expression
// integer->integer*integer
public class MethodReferenceEx2 {
	
	public static void main(String[] args) {

		// map accepts function as a argument and apply that function on each element from stream
				// lambda expression is used to define new functionality
				// method reference is used to reuse predefine functionality
				
		List<String> list=Arrays.asList("Java","Angular","HTML","CSS");
		list.forEach(System.out::println);
		Stream<String> stream=list.stream();// stream=> ["Java","Angular","HTML","CSS"] Stream object
	
		System.out.println(stream.map(String::length).reduce((s1,s2)->s1+s2));

	//	Stream<Integer> stream2=stream.map(String::length);//stream2 => [4,7,4,3] Stream object
		
	//	Stream<Integer> strem2=stream.map(string->string.length()*2);//strem2 => [8,14,8,6] Stream object

		
		
//		// apply length() of String class on each element from Stream
//		
//		strem2.forEach(System.out::println);
		//strem2.forEach(integer->System.out.println(integer));
		//strem2.forEach(integer->System.out.println(integer*2));// here method reference can not be used 
		
		
		//Stream<Integer> stream2=stream.map(String::length);
		// apply length() of String class on every member from Stream
		// stream2==>[4,7,4,3] Stream object given by map
		//stream2=stream2.filter(integer->integer%2==0);//stream2==>[4,4] Stream object
		//stream2.forEach(System.out::println);
		
			}

}

