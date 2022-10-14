package com.kiranacademy.lambdaex;

public class LambdaExample {

	
	public static void main(String[] args) {
		
		Operations o=(a,b)->a+b;
		
		System.out.println(o.add(10, 20));
		
		System.out.println(o.getClass().getName());
		
		String s="KiranAcademy";
		System.out.println(s.getClass().getName());
				
		Operations o2=(a,b)-> {
				
				int ans;
				ans=a+b;
				return ans;
		};
		
		System.out.println(o2.add(12, 2));
		
	}
	
}
