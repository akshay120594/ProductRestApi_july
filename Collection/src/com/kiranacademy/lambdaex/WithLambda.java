package com.kiranacademy.lambdaex;

import java.util.function.Predicate;

public class WithLambda {

	public static void main(String[] args) {
		
		Predicate<String> p1 = name->name.length()==4;
		
		System.out.println(p1.test("Java"));

		Predicate<String> p2 = name->name.startsWith("J");
		
		System.out.println(p2.test("Java"));
		
	}
}
