package com.kiranacademy.lambdaex;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> p=(integer)->integer%2==0;
		boolean b = p.test(10);
		System.out.println(b);
		
	}

}
