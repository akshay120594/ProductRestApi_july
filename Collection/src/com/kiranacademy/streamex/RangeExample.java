package com.kiranacademy.streamex;

import java.util.stream.IntStream;

/* to print 1-100 numbers without using loops*/

public class RangeExample {

	public static void main(String[] args) {
		
		IntStream.range(1, 101).forEach(System.out::println);
		
	}
}
