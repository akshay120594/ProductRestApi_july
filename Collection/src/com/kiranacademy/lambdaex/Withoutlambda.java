
package com.kiranacademy.lambdaex;

import java.util.function.Predicate;

/*
 	interface Predicate
 	{
 
    	boolean test(Object o);
    }
 */

class PredicateImpl implements Predicate<String>
{
	@Override
	public boolean test(String name) 
	{
		
		return name.length()==4;
	}
	
}

public class Withoutlambda {

	public static void main(String[] args) {
		
		System.out.println(new PredicateImpl().test("Java"));
		
		System.out.println(new PredicateImpl().test("javabykiran"));
		
	}

}


