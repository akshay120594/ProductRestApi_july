package com.kiranacademy.lambdaex;

public class LambdaEx2 {

	public static void main(String[] args) {
		
		Operations o=(a,b)-> a+b;
		System.out.println(o.add(10, 20));
		
		o=(a,b)-> {
			
			int c;
			c=a+b;
			return c;
		};
		
		System.out.println(o.add(10, 20));
		
		
		Operations2 obj = (a,b)->System.out.println(a+b);
		obj.add(10, 20);
		
	}
}
